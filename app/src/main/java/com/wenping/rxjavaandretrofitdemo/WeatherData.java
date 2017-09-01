package com.wenping.rxjavaandretrofitdemo;

/**
 * Created by wenping on 9/1/2017.
 */

public class WeatherData {


    @Override
    public String toString() {
        return "WeatherData{" +
                "resultcode='" + resultcode + '\'' +
                ", reason='" + reason + '\'' +
                ", result=" + result +
                ", error_code=" + error_code +
                '}';
    }

    /**
     * resultcode : 200
     * reason : successed!
     * result : {"sk":{"temp":"28","wind_direction":"东北风","wind_strength":"1级","humidity":"46%","time":"16:50"},"today":{"temperature":"24℃~29℃","weather":"阴","weather_id":{"fa":"02","fb":"02"},"wind":"东北风微风","week":"星期五","city":"上海","date_y":"2017年09月01日","dressing_index":"热","dressing_advice":"天气热，建议着短裙、短裤、短薄外套、T恤等夏季服装。","uv_index":"弱","comfort_index":"","wash_index":"较适宜","travel_index":"较不宜","exercise_index":"较不宜","drying_index":""},"future":{"day_20170901":{"temperature":"24℃~29℃","weather":"阴","weather_id":{"fa":"02","fb":"02"},"wind":"东北风微风","week":"星期五","date":"20170901"},"day_20170902":{"temperature":"24℃~29℃","weather":"多云转阴","weather_id":{"fa":"01","fb":"02"},"wind":"东风微风","week":"星期六","date":"20170902"},"day_20170903":{"temperature":"25℃~30℃","weather":"多云转阴","weather_id":{"fa":"01","fb":"02"},"wind":"东风微风","week":"星期日","date":"20170903"},"day_20170904":{"temperature":"26℃~31℃","weather":"小雨转多云","weather_id":{"fa":"07","fb":"01"},"wind":"东南风3-4 级","week":"星期一","date":"20170904"},"day_20170905":{"temperature":"25℃~32℃","weather":"中雨转小雨","weather_id":{"fa":"08","fb":"07"},"wind":"西南风微风","week":"星期二","date":"20170905"},"day_20170906":{"temperature":"26℃~31℃","weather":"小雨转多云","weather_id":{"fa":"07","fb":"01"},"wind":"东南风3-4 级","week":"星期三","date":"20170906"},"day_20170907":{"temperature":"26℃~31℃","weather":"小雨转多云","weather_id":{"fa":"07","fb":"01"},"wind":"东南风3-4 级","week":"星期四","date":"20170907"}}}
     * error_code : 0
     */

    private String resultcode;
    private String reason;
    /**
     * sk : {"temp":"28","wind_direction":"东北风","wind_strength":"1级","humidity":"46%","time":"16:50"}
     * today : {"temperature":"24℃~29℃","weather":"阴","weather_id":{"fa":"02","fb":"02"},"wind":"东北风微风","week":"星期五","city":"上海","date_y":"2017年09月01日","dressing_index":"热","dressing_advice":"天气热，建议着短裙、短裤、短薄外套、T恤等夏季服装。","uv_index":"弱","comfort_index":"","wash_index":"较适宜","travel_index":"较不宜","exercise_index":"较不宜","drying_index":""}
     * future : {"day_20170901":{"temperature":"24℃~29℃","weather":"阴","weather_id":{"fa":"02","fb":"02"},"wind":"东北风微风","week":"星期五","date":"20170901"},"day_20170902":{"temperature":"24℃~29℃","weather":"多云转阴","weather_id":{"fa":"01","fb":"02"},"wind":"东风微风","week":"星期六","date":"20170902"},"day_20170903":{"temperature":"25℃~30℃","weather":"多云转阴","weather_id":{"fa":"01","fb":"02"},"wind":"东风微风","week":"星期日","date":"20170903"},"day_20170904":{"temperature":"26℃~31℃","weather":"小雨转多云","weather_id":{"fa":"07","fb":"01"},"wind":"东南风3-4 级","week":"星期一","date":"20170904"},"day_20170905":{"temperature":"25℃~32℃","weather":"中雨转小雨","weather_id":{"fa":"08","fb":"07"},"wind":"西南风微风","week":"星期二","date":"20170905"},"day_20170906":{"temperature":"26℃~31℃","weather":"小雨转多云","weather_id":{"fa":"07","fb":"01"},"wind":"东南风3-4 级","week":"星期三","date":"20170906"},"day_20170907":{"temperature":"26℃~31℃","weather":"小雨转多云","weather_id":{"fa":"07","fb":"01"},"wind":"东南风3-4 级","week":"星期四","date":"20170907"}}
     */

    private ResultBean result;
    private int error_code;

    public String getResultcode() {
        return resultcode;
    }

    public void setResultcode(String resultcode) {
        this.resultcode = resultcode;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public int getError_code() {
        return error_code;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }

    public static class ResultBean {

        @Override
        public String toString() {
            return "ResultBean{" +
                    "sk=" + sk +
                    ", today=" + today +
                    ", future=" + future +
                    '}';
        }

        /**
         * temp : 28
         * wind_direction : 东北风
         * wind_strength : 1级
         * humidity : 46%
         * time : 16:50
         */

        private SkBean sk;
        /**
         * temperature : 24℃~29℃
         * weather : 阴
         * weather_id : {"fa":"02","fb":"02"}
         * wind : 东北风微风
         * week : 星期五
         * city : 上海
         * date_y : 2017年09月01日
         * dressing_index : 热
         * dressing_advice : 天气热，建议着短裙、短裤、短薄外套、T恤等夏季服装。
         * uv_index : 弱
         * comfort_index :
         * wash_index : 较适宜
         * travel_index : 较不宜
         * exercise_index : 较不宜
         * drying_index :
         */

        private TodayBean today;
        /**
         * day_20170901 : {"temperature":"24℃~29℃","weather":"阴","weather_id":{"fa":"02","fb":"02"},"wind":"东北风微风","week":"星期五","date":"20170901"}
         * day_20170902 : {"temperature":"24℃~29℃","weather":"多云转阴","weather_id":{"fa":"01","fb":"02"},"wind":"东风微风","week":"星期六","date":"20170902"}
         * day_20170903 : {"temperature":"25℃~30℃","weather":"多云转阴","weather_id":{"fa":"01","fb":"02"},"wind":"东风微风","week":"星期日","date":"20170903"}
         * day_20170904 : {"temperature":"26℃~31℃","weather":"小雨转多云","weather_id":{"fa":"07","fb":"01"},"wind":"东南风3-4 级","week":"星期一","date":"20170904"}
         * day_20170905 : {"temperature":"25℃~32℃","weather":"中雨转小雨","weather_id":{"fa":"08","fb":"07"},"wind":"西南风微风","week":"星期二","date":"20170905"}
         * day_20170906 : {"temperature":"26℃~31℃","weather":"小雨转多云","weather_id":{"fa":"07","fb":"01"},"wind":"东南风3-4 级","week":"星期三","date":"20170906"}
         * day_20170907 : {"temperature":"26℃~31℃","weather":"小雨转多云","weather_id":{"fa":"07","fb":"01"},"wind":"东南风3-4 级","week":"星期四","date":"20170907"}
         */

        private FutureBean future;

        public SkBean getSk() {
            return sk;
        }

        public void setSk(SkBean sk) {
            this.sk = sk;
        }

        public TodayBean getToday() {
            return today;
        }

        public void setToday(TodayBean today) {
            this.today = today;
        }

        public FutureBean getFuture() {
            return future;
        }

        public void setFuture(FutureBean future) {
            this.future = future;
        }

        public static class SkBean {
            private String temp;
            private String wind_direction;
            private String wind_strength;
            private String humidity;
            private String time;

            @Override
            public String toString() {
                return "SkBean{" +
                        "temp='" + temp + '\'' +
                        ", wind_direction='" + wind_direction + '\'' +
                        ", wind_strength='" + wind_strength + '\'' +
                        ", humidity='" + humidity + '\'' +
                        ", time='" + time + '\'' +
                        '}';
            }

            public String getTemp() {
                return temp;
            }

            public void setTemp(String temp) {
                this.temp = temp;
            }

            public String getWind_direction() {
                return wind_direction;
            }

            public void setWind_direction(String wind_direction) {
                this.wind_direction = wind_direction;
            }

            public String getWind_strength() {
                return wind_strength;
            }

            public void setWind_strength(String wind_strength) {
                this.wind_strength = wind_strength;
            }

            public String getHumidity() {
                return humidity;
            }

            public void setHumidity(String humidity) {
                this.humidity = humidity;
            }

            public String getTime() {
                return time;
            }

            public void setTime(String time) {
                this.time = time;
            }
        }

        public static class TodayBean {
            private String temperature;
            private String weather;

            @Override
            public String toString() {
                return "TodayBean{" +
                        "temperature='" + temperature + '\'' +
                        ", weather='" + weather + '\'' +
                        ", weather_id=" + weather_id +
                        ", wind='" + wind + '\'' +
                        ", week='" + week + '\'' +
                        ", city='" + city + '\'' +
                        ", date_y='" + date_y + '\'' +
                        ", dressing_index='" + dressing_index + '\'' +
                        ", dressing_advice='" + dressing_advice + '\'' +
                        ", uv_index='" + uv_index + '\'' +
                        ", comfort_index='" + comfort_index + '\'' +
                        ", wash_index='" + wash_index + '\'' +
                        ", travel_index='" + travel_index + '\'' +
                        ", exercise_index='" + exercise_index + '\'' +
                        ", drying_index='" + drying_index + '\'' +
                        '}';
            }

            /**
             * fa : 02
             * fb : 02
             */

            private WeatherIdBean weather_id;
            private String wind;
            private String week;
            private String city;
            private String date_y;
            private String dressing_index;
            private String dressing_advice;
            private String uv_index;
            private String comfort_index;
            private String wash_index;
            private String travel_index;
            private String exercise_index;
            private String drying_index;

            public String getTemperature() {
                return temperature;
            }

            public void setTemperature(String temperature) {
                this.temperature = temperature;
            }

            public String getWeather() {
                return weather;
            }

            public void setWeather(String weather) {
                this.weather = weather;
            }

            public WeatherIdBean getWeather_id() {
                return weather_id;
            }

            public void setWeather_id(WeatherIdBean weather_id) {
                this.weather_id = weather_id;
            }

            public String getWind() {
                return wind;
            }

            public void setWind(String wind) {
                this.wind = wind;
            }

            public String getWeek() {
                return week;
            }

            public void setWeek(String week) {
                this.week = week;
            }

            public String getCity() {
                return city;
            }

            public void setCity(String city) {
                this.city = city;
            }

            public String getDate_y() {
                return date_y;
            }

            public void setDate_y(String date_y) {
                this.date_y = date_y;
            }

            public String getDressing_index() {
                return dressing_index;
            }

            public void setDressing_index(String dressing_index) {
                this.dressing_index = dressing_index;
            }

            public String getDressing_advice() {
                return dressing_advice;
            }

            public void setDressing_advice(String dressing_advice) {
                this.dressing_advice = dressing_advice;
            }

            public String getUv_index() {
                return uv_index;
            }

            public void setUv_index(String uv_index) {
                this.uv_index = uv_index;
            }

            public String getComfort_index() {
                return comfort_index;
            }

            public void setComfort_index(String comfort_index) {
                this.comfort_index = comfort_index;
            }

            public String getWash_index() {
                return wash_index;
            }

            public void setWash_index(String wash_index) {
                this.wash_index = wash_index;
            }

            public String getTravel_index() {
                return travel_index;
            }

            public void setTravel_index(String travel_index) {
                this.travel_index = travel_index;
            }

            public String getExercise_index() {
                return exercise_index;
            }

            public void setExercise_index(String exercise_index) {
                this.exercise_index = exercise_index;
            }

            public String getDrying_index() {
                return drying_index;
            }

            public void setDrying_index(String drying_index) {
                this.drying_index = drying_index;
            }

            public static class WeatherIdBean {
                private String fa;
                private String fb;

                public String getFa() {
                    return fa;
                }

                public void setFa(String fa) {
                    this.fa = fa;
                }

                public String getFb() {
                    return fb;
                }

                public void setFb(String fb) {
                    this.fb = fb;
                }
            }
        }

        public static class FutureBean {
            /**
             * temperature : 24℃~29℃
             * weather : 阴
             * weather_id : {"fa":"02","fb":"02"}
             * wind : 东北风微风
             * week : 星期五
             * date : 20170901
             */

            private Day20170901Bean day_20170901;
            /**
             * temperature : 24℃~29℃
             * weather : 多云转阴
             * weather_id : {"fa":"01","fb":"02"}
             * wind : 东风微风
             * week : 星期六
             * date : 20170902
             */

            private Day20170902Bean day_20170902;
            /**
             * temperature : 25℃~30℃
             * weather : 多云转阴
             * weather_id : {"fa":"01","fb":"02"}
             * wind : 东风微风
             * week : 星期日
             * date : 20170903
             */

            private Day20170903Bean day_20170903;
            /**
             * temperature : 26℃~31℃
             * weather : 小雨转多云
             * weather_id : {"fa":"07","fb":"01"}
             * wind : 东南风3-4 级
             * week : 星期一
             * date : 20170904
             */

            private Day20170904Bean day_20170904;
            /**
             * temperature : 25℃~32℃
             * weather : 中雨转小雨
             * weather_id : {"fa":"08","fb":"07"}
             * wind : 西南风微风
             * week : 星期二
             * date : 20170905
             */

            private Day20170905Bean day_20170905;
            /**
             * temperature : 26℃~31℃
             * weather : 小雨转多云
             * weather_id : {"fa":"07","fb":"01"}
             * wind : 东南风3-4 级
             * week : 星期三
             * date : 20170906
             */

            private Day20170906Bean day_20170906;
            /**
             * temperature : 26℃~31℃
             * weather : 小雨转多云
             * weather_id : {"fa":"07","fb":"01"}
             * wind : 东南风3-4 级
             * week : 星期四
             * date : 20170907
             */

            private Day20170907Bean day_20170907;

            public Day20170901Bean getDay_20170901() {
                return day_20170901;
            }

            public void setDay_20170901(Day20170901Bean day_20170901) {
                this.day_20170901 = day_20170901;
            }

            public Day20170902Bean getDay_20170902() {
                return day_20170902;
            }

            public void setDay_20170902(Day20170902Bean day_20170902) {
                this.day_20170902 = day_20170902;
            }

            public Day20170903Bean getDay_20170903() {
                return day_20170903;
            }

            public void setDay_20170903(Day20170903Bean day_20170903) {
                this.day_20170903 = day_20170903;
            }

            public Day20170904Bean getDay_20170904() {
                return day_20170904;
            }

            public void setDay_20170904(Day20170904Bean day_20170904) {
                this.day_20170904 = day_20170904;
            }

            public Day20170905Bean getDay_20170905() {
                return day_20170905;
            }

            public void setDay_20170905(Day20170905Bean day_20170905) {
                this.day_20170905 = day_20170905;
            }

            public Day20170906Bean getDay_20170906() {
                return day_20170906;
            }

            public void setDay_20170906(Day20170906Bean day_20170906) {
                this.day_20170906 = day_20170906;
            }

            public Day20170907Bean getDay_20170907() {
                return day_20170907;
            }

            public void setDay_20170907(Day20170907Bean day_20170907) {
                this.day_20170907 = day_20170907;
            }

            public static class Day20170901Bean {
                private String temperature;
                private String weather;
                /**
                 * fa : 02
                 * fb : 02
                 */

                private WeatherIdBean weather_id;
                private String wind;
                private String week;
                private String date;

                public String getTemperature() {
                    return temperature;
                }

                public void setTemperature(String temperature) {
                    this.temperature = temperature;
                }

                public String getWeather() {
                    return weather;
                }

                public void setWeather(String weather) {
                    this.weather = weather;
                }

                public WeatherIdBean getWeather_id() {
                    return weather_id;
                }

                public void setWeather_id(WeatherIdBean weather_id) {
                    this.weather_id = weather_id;
                }

                public String getWind() {
                    return wind;
                }

                public void setWind(String wind) {
                    this.wind = wind;
                }

                public String getWeek() {
                    return week;
                }

                public void setWeek(String week) {
                    this.week = week;
                }

                public String getDate() {
                    return date;
                }

                public void setDate(String date) {
                    this.date = date;
                }

                public static class WeatherIdBean {
                    private String fa;
                    private String fb;

                    public String getFa() {
                        return fa;
                    }

                    public void setFa(String fa) {
                        this.fa = fa;
                    }

                    public String getFb() {
                        return fb;
                    }

                    public void setFb(String fb) {
                        this.fb = fb;
                    }
                }
            }

            public static class Day20170902Bean {
                private String temperature;
                private String weather;
                /**
                 * fa : 01
                 * fb : 02
                 */

                private WeatherIdBean weather_id;
                private String wind;
                private String week;
                private String date;

                public String getTemperature() {
                    return temperature;
                }

                public void setTemperature(String temperature) {
                    this.temperature = temperature;
                }

                public String getWeather() {
                    return weather;
                }

                public void setWeather(String weather) {
                    this.weather = weather;
                }

                public WeatherIdBean getWeather_id() {
                    return weather_id;
                }

                public void setWeather_id(WeatherIdBean weather_id) {
                    this.weather_id = weather_id;
                }

                public String getWind() {
                    return wind;
                }

                public void setWind(String wind) {
                    this.wind = wind;
                }

                public String getWeek() {
                    return week;
                }

                public void setWeek(String week) {
                    this.week = week;
                }

                public String getDate() {
                    return date;
                }

                public void setDate(String date) {
                    this.date = date;
                }

                public static class WeatherIdBean {
                    private String fa;
                    private String fb;

                    public String getFa() {
                        return fa;
                    }

                    public void setFa(String fa) {
                        this.fa = fa;
                    }

                    public String getFb() {
                        return fb;
                    }

                    public void setFb(String fb) {
                        this.fb = fb;
                    }
                }
            }

            public static class Day20170903Bean {
                private String temperature;
                private String weather;
                /**
                 * fa : 01
                 * fb : 02
                 */

                private WeatherIdBean weather_id;
                private String wind;
                private String week;
                private String date;

                public String getTemperature() {
                    return temperature;
                }

                public void setTemperature(String temperature) {
                    this.temperature = temperature;
                }

                public String getWeather() {
                    return weather;
                }

                public void setWeather(String weather) {
                    this.weather = weather;
                }

                public WeatherIdBean getWeather_id() {
                    return weather_id;
                }

                public void setWeather_id(WeatherIdBean weather_id) {
                    this.weather_id = weather_id;
                }

                public String getWind() {
                    return wind;
                }

                public void setWind(String wind) {
                    this.wind = wind;
                }

                public String getWeek() {
                    return week;
                }

                public void setWeek(String week) {
                    this.week = week;
                }

                public String getDate() {
                    return date;
                }

                public void setDate(String date) {
                    this.date = date;
                }

                public static class WeatherIdBean {
                    private String fa;
                    private String fb;

                    public String getFa() {
                        return fa;
                    }

                    public void setFa(String fa) {
                        this.fa = fa;
                    }

                    public String getFb() {
                        return fb;
                    }

                    public void setFb(String fb) {
                        this.fb = fb;
                    }
                }
            }

            public static class Day20170904Bean {
                private String temperature;
                private String weather;
                /**
                 * fa : 07
                 * fb : 01
                 */

                private WeatherIdBean weather_id;
                private String wind;
                private String week;
                private String date;

                public String getTemperature() {
                    return temperature;
                }

                public void setTemperature(String temperature) {
                    this.temperature = temperature;
                }

                public String getWeather() {
                    return weather;
                }

                public void setWeather(String weather) {
                    this.weather = weather;
                }

                public WeatherIdBean getWeather_id() {
                    return weather_id;
                }

                public void setWeather_id(WeatherIdBean weather_id) {
                    this.weather_id = weather_id;
                }

                public String getWind() {
                    return wind;
                }

                public void setWind(String wind) {
                    this.wind = wind;
                }

                public String getWeek() {
                    return week;
                }

                public void setWeek(String week) {
                    this.week = week;
                }

                public String getDate() {
                    return date;
                }

                public void setDate(String date) {
                    this.date = date;
                }

                public static class WeatherIdBean {
                    private String fa;
                    private String fb;

                    public String getFa() {
                        return fa;
                    }

                    public void setFa(String fa) {
                        this.fa = fa;
                    }

                    public String getFb() {
                        return fb;
                    }

                    public void setFb(String fb) {
                        this.fb = fb;
                    }
                }
            }

            public static class Day20170905Bean {
                private String temperature;
                private String weather;
                /**
                 * fa : 08
                 * fb : 07
                 */

                private WeatherIdBean weather_id;
                private String wind;
                private String week;
                private String date;

                public String getTemperature() {
                    return temperature;
                }

                public void setTemperature(String temperature) {
                    this.temperature = temperature;
                }

                public String getWeather() {
                    return weather;
                }

                public void setWeather(String weather) {
                    this.weather = weather;
                }

                public WeatherIdBean getWeather_id() {
                    return weather_id;
                }

                public void setWeather_id(WeatherIdBean weather_id) {
                    this.weather_id = weather_id;
                }

                public String getWind() {
                    return wind;
                }

                public void setWind(String wind) {
                    this.wind = wind;
                }

                public String getWeek() {
                    return week;
                }

                public void setWeek(String week) {
                    this.week = week;
                }

                public String getDate() {
                    return date;
                }

                public void setDate(String date) {
                    this.date = date;
                }

                public static class WeatherIdBean {
                    private String fa;
                    private String fb;

                    public String getFa() {
                        return fa;
                    }

                    public void setFa(String fa) {
                        this.fa = fa;
                    }

                    public String getFb() {
                        return fb;
                    }

                    public void setFb(String fb) {
                        this.fb = fb;
                    }
                }
            }

            public static class Day20170906Bean {
                private String temperature;
                private String weather;
                /**
                 * fa : 07
                 * fb : 01
                 */

                private WeatherIdBean weather_id;
                private String wind;
                private String week;
                private String date;

                public String getTemperature() {
                    return temperature;
                }

                public void setTemperature(String temperature) {
                    this.temperature = temperature;
                }

                public String getWeather() {
                    return weather;
                }

                public void setWeather(String weather) {
                    this.weather = weather;
                }

                public WeatherIdBean getWeather_id() {
                    return weather_id;
                }

                public void setWeather_id(WeatherIdBean weather_id) {
                    this.weather_id = weather_id;
                }

                public String getWind() {
                    return wind;
                }

                public void setWind(String wind) {
                    this.wind = wind;
                }

                public String getWeek() {
                    return week;
                }

                public void setWeek(String week) {
                    this.week = week;
                }

                public String getDate() {
                    return date;
                }

                public void setDate(String date) {
                    this.date = date;
                }

                public static class WeatherIdBean {
                    private String fa;
                    private String fb;

                    public String getFa() {
                        return fa;
                    }

                    public void setFa(String fa) {
                        this.fa = fa;
                    }

                    public String getFb() {
                        return fb;
                    }

                    public void setFb(String fb) {
                        this.fb = fb;
                    }
                }
            }

            public static class Day20170907Bean {
                private String temperature;
                private String weather;
                /**
                 * fa : 07
                 * fb : 01
                 */

                private WeatherIdBean weather_id;
                private String wind;
                private String week;
                private String date;

                public String getTemperature() {
                    return temperature;
                }

                public void setTemperature(String temperature) {
                    this.temperature = temperature;
                }

                public String getWeather() {
                    return weather;
                }

                public void setWeather(String weather) {
                    this.weather = weather;
                }

                public WeatherIdBean getWeather_id() {
                    return weather_id;
                }

                public void setWeather_id(WeatherIdBean weather_id) {
                    this.weather_id = weather_id;
                }

                public String getWind() {
                    return wind;
                }

                public void setWind(String wind) {
                    this.wind = wind;
                }

                public String getWeek() {
                    return week;
                }

                public void setWeek(String week) {
                    this.week = week;
                }

                public String getDate() {
                    return date;
                }

                public void setDate(String date) {
                    this.date = date;
                }

                public static class WeatherIdBean {
                    private String fa;
                    private String fb;

                    public String getFa() {
                        return fa;
                    }

                    public void setFa(String fa) {
                        this.fa = fa;
                    }

                    public String getFb() {
                        return fb;
                    }

                    public void setFb(String fb) {
                        this.fb = fb;
                    }
                }
            }
        }
    }


//    public Coordinates coord;
//    public Local sys;
//    public List<Weather> weathers;
//    public String base;
//    public Main main;
//    public Wind wind;
//    public Rain rain;
//    public Cloud clouds;
//    public long id;
//    public long dt;
//    public String name;
//    public int cod;
//
//    public static class Coordinates {
//        public double lat;
//        public double lon;
//
//        @Override
//        public String toString() {
//            final StringBuilder sb = new StringBuilder("Coordinates{");
//            sb.append("lat=").append(lat);
//            sb.append(", lon=").append(lon);
//            sb.append('}');
//            return sb.toString();
//        }
//    }
//
//    public static class Local {
//        public String country;
//        public long sunrise;
//        public long sunset;
//
//        @Override
//        public String toString() {
//            final StringBuilder sb = new StringBuilder("Local{");
//            sb.append("country='").append(country).append('\'');
//            sb.append(", sunrise=").append(sunrise);
//            sb.append(", sunset=").append(sunset);
//            sb.append('}');
//            return sb.toString();
//        }
//    }
//
//    public static class Weather {
//        public int id;
//        public String main;
//        public String description;
//        public String icon;
//
//        @Override
//        public String toString() {
//            final StringBuilder sb = new StringBuilder("Weather{");
//            sb.append("id=").append(id);
//            sb.append(", main='").append(main).append('\'');
//            sb.append(", description='").append(description).append('\'');
//            sb.append(", icon='").append(icon).append('\'');
//            sb.append('}');
//            return sb.toString();
//        }
//    }
//
//    public static class Main {
//        public double temp;
//        public double pressure;
//        public double humidity;
//        public double temp_min;
//        public double temp_max;
//        public double sea_level;
//        public double grnd_level;
//
//        @Override
//        public String toString() {
//            final StringBuilder sb = new StringBuilder("Main{");
//            sb.append("temp=").append(temp);
//            sb.append(", pressure=").append(pressure);
//            sb.append(", humidity=").append(humidity);
//            sb.append(", temp_min=").append(temp_min);
//            sb.append(", temp_max=").append(temp_max);
//            sb.append(", sea_level=").append(sea_level);
//            sb.append(", grnd_level=").append(grnd_level);
//            sb.append('}');
//            return sb.toString();
//        }
//    }
//
//    public static class Wind {
//        public double speed;
//        public double deg;
//
//        @Override
//        public String toString() {
//            final StringBuilder sb = new StringBuilder("Wind{");
//            sb.append("speed=").append(speed);
//            sb.append(", deg=").append(deg);
//            sb.append('}');
//            return sb.toString();
//        }
//    }
//
//    public static class Rain {
//        public int threehourforecast;
//
//        @Override
//        public String toString() {
//            final StringBuilder sb = new StringBuilder("Rain{");
//            sb.append("threehourforecast=").append(threehourforecast);
//            sb.append('}');
//            return sb.toString();
//        }
//    }
//
//    public static class Cloud {
//        public int all;
//
//        @Override
//        public String toString() {
//            final StringBuilder sb = new StringBuilder("Cloud{");
//            sb.append("all=").append(all);
//            sb.append('}');
//            return sb.toString();
//        }
//    }
//
//    @Override
//    public String toString() {
//        final StringBuilder sb = new StringBuilder("WeatherData{");
//        sb.append("coord=").append(coord);
//        sb.append(", sys=").append(sys);
//        sb.append(", weathers=").append(weathers);
//        sb.append(", base='").append(base).append('\'');
//        sb.append(", main=").append(main);
//        sb.append(", wind=").append(wind);
//        sb.append(", rain=").append(rain);
//        sb.append(", clouds=").append(clouds);
//        sb.append(", id=").append(id);
//        sb.append(", dt=").append(dt);
//        sb.append(", name='").append(name).append('\'');
//        sb.append(", cod=").append(cod);
//        sb.append('}');
//        return sb.toString();
//    }


}
