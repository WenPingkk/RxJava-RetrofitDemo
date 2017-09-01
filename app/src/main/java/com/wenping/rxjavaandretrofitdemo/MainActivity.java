package com.wenping.rxjavaandretrofitdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button mBtnBj;
    private Button mBtnSh;
    private Button mBtnSz;
    private Button mBtnAll;
    private TextView mTvResult;

//    private String[] cities = new String[]{"beijing","shenzhen","shanghai"};
    private String[] cities = new String[]{"北京","深圳","上海"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        mBtnAll = (Button) findViewById(R.id.btn_all);
        mTvResult = (TextView) findViewById(R.id.tv_result);

        mBtnAll.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_all:
                getAllWeather();
                break;
        }
    }

    private void getAllWeather() {
        Observable.fromArray(cities)
                .flatMap(
                        new Function<String, ObservableSource<WeatherData>>() {
                            @Override
                            public ObservableSource<WeatherData> apply(@NonNull String s) throws Exception {
                                return new Util().getWeatherService().getWeatherByRxjava(s,"json",1,
                                "4f0400b15ffec0136daf3350cb408480");
                            }
                        }
                )
                .subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread())
                .subscribe(
                        new Observer<WeatherData>() {
                            @Override
                            public void onSubscribe(@NonNull Disposable d) {
                                Log.e(TAG, "onSubscribe "+d.toString());
                            }

                            @Override
                            public void onNext(@NonNull WeatherData data) {
                                Log.e(TAG, "onNext "+data.toString()+";"+data.getResultcode()+";");
                                mTvResult.setText(mTvResult.getText().toString()+ data.getResult().getToday().getCity().toString()+data.toString());
                            }

                            @Override
                            public void onError(@NonNull Throwable e) {
                                Log.e(TAG, "onError "+e.toString());
                                Toast.makeText(MainActivity.this, "error"+e.toString(), Toast.LENGTH_LONG).show();
                            }

                            @Override
                            public void onComplete() {
                                Toast.makeText(MainActivity.this, "wenpingkk", Toast.LENGTH_LONG).show();
                            }
                        }
                );
    }
    private static final String TAG = "wenping";
}































