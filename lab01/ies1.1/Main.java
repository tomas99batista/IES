import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

// curl http://api.ipma.pt/open-//data/forecast/meteorology/cities/daily/1010500.json | json_pp

public class Main {
    public static void main(String[] args) {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://api.ipma.pt/open-data/")
                .addConverterFactory(GsonConverterFactory. create ())
                .build();
        IpmaService service = retrofit.create(IpmaService.class);
        Call<IpmaCityForecast> callSync = service.getForecastForACity(Integer.parseInt(args[0]) ); // AVEIRO: 1010500
        try {
            Response<IpmaCityForecast> apiResponse = callSync.execute();
            IpmaCityForecast forecast = apiResponse.body();

            System.out.println("DATE: " + forecast.getData().listIterator().next().getForecastDate());

            System. out .println( "Max temperature for today is: " + forecast.getData().
                    listIterator().next().getTMax());
            System. out .println( "Min temperature for today is: " + forecast.getData().
                    listIterator().next().getTMin());

            System.out.println("Latitude: " + forecast.getData().listIterator().next().getLatitude());
            System.out.println("Longitude: " + forecast.getData().listIterator().next().getLongitude());

            System.out.println("Probability Precipitation: " + forecast.getData().listIterator().next().getPrecipitaProb());

        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
