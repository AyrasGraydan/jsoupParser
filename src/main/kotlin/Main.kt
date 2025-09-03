import org.jsoup.Jsoup
import org.jsoup.nodes.Document
import org.jsoup.nodes.Element
import org.jsoup.select.Elements


fun main() {

    val url = "https://mybook.ru/author/duglas-adams/avtostopom-po-galaktike-restoran-u-konca-vselennoj/citations/"

    val doc: Document = Jsoup.connect(url).get()


    val quotes: Elements = doc.select(".sc-2aegk7-2")

    for (quote: Element in quotes) {
        println(quote.text())
    }
}
