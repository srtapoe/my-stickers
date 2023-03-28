import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class RankingMovies {
    public static void main(String[] args) throws IOException, InterruptedException {

        /*
        TITULO, ANO, CLASSIFICAO, POSTER
        acesso api: ar-hzumz6bcb9wc3xy7d936jri7
         */
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://api.themoviedb.org/3/movie/550?api_key=9da1e136986a2ed99ecaac1ef7885802"))
                .method("GET", HttpRequest.BodyPublishers.noBody())
                .build();
        HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());
    }
}