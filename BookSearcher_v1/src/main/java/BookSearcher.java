
import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class BookSearcher {
    public static void main(String[] args)
    {
        System.out.println("Введите поисковый запрос" );
       /* Scanner scanner = new Scanner(System. in);
        String query = scanner. nextLine();
        String text = query.split(" ")[0];

        System.out.println("Ваш запрос: " + query.replaceAll(" ", "+") + "     " + text );

        Set<String> result = new HashSet<String>();
        String request = "https://www.litres.ru/pages/rmd_search/?q=" + query;

        try {

            Document doc = Jsoup
                    .connect(request)
                    .userAgent(
                            "Mozilla/5.0 (compatible; Googlebot/2.1; +http://www.google.com/bot.html)")
                    .timeout(5000).get();

            Elements links = doc.select("a[href]");
            for (Element link: links
            ) {
                if (link.getElementsByAttributeStarting("title") != null && link.getElementsByAttributeStarting("title").text().toLowerCase().trim().contains(text.toLowerCase().trim())) {
                    try {
                        Document bookPage = Jsoup
                                .connect(link.absUrl("href"))
                                .userAgent(
                                        "Mozilla/5.0 (compatible; Googlebot/2.1; +http://www.google.com/bot.html)")
                                .timeout(5000).get();
                        System.out.println(bookPage.title());
                        System.out.println("Автор: " + bookPage.getElementsByClass("biblio_book_author__link").text());
                        System.out.println("Жанры + теги: " + bookPage.getElementsByClass("biblio_info__link").text());
                        System.out.println("Описание + сожержание: " + bookPage.getElementsByClass("biblio_book_descr_publishers").text());

                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                    break;
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
*/
    }
}
