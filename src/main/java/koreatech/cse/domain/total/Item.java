package koreatech.cse.domain.total;

import koreatech.cse.domain.total.Authors;
import koreatech.cse.domain.total.Books;
import koreatech.cse.domain.total.Publication;
import koreatech.cse.domain.total.Publisher;

public class Item {
    private String ctype;
    private String title;
    private Authors authors;
    private String pages;
    private String preview;
    private String link_url;
    private String link_api;
    private Publisher publisher;
    private Publication publication;
    private Books books;

    public Item(String ctype, String title, Authors authors, String pages, String preview, String link_url, String link_api, Publisher publisher, Publication publication, Books books) {
        this.ctype = ctype;
        this.title = title;
        this.authors = authors;
        this.pages = pages;
        this.preview = preview;
        this.link_url = link_url;
        this.link_api = link_api;
        this.publisher = publisher;
        this.publication = publication;
        this.books = books;
    }

    public Item() {
        this.ctype = null;
        this.title = null;
        this.authors = null;
        this.pages = null;
        this.preview = null;
        this.link_url = null;
        this.link_api = null;
        this.publisher = null;
        this.publication = null;
        this.books = null;
    }

    public String toString() {
        return "Item{ctype='" + this.ctype + '\'' + ", title='" + this.title + '\'' + ", authors=" + this.authors + ", pages='" + this.pages + '\'' + ", preview='" + this.preview + '\'' + ", link_url='" + this.link_url + '\'' + ", link_api='" + this.link_api + '\'' + ", publisher=" + (Object)this.publisher + ", publication=" + (Object)this.publication + ", books=" + this.books + '}';
    }

    public Books getBooks() {
        return this.books;
    }

    public void setBooks(Books books) {
        this.books = books;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Authors getAuthors() {
        return this.authors;
    }

    public void setAuthors(Authors authors) {
        this.authors = authors;
    }

    public String getPages() {
        return this.pages;
    }

    public void setPages(String pages) {
        this.pages = pages;
    }

    public String getPreview() {
        return this.preview;
    }

    public void setPreview(String preview) {
        this.preview = preview;
    }

    public String getLink_url() {
        return this.link_url;
    }

    public void setLink_url(String link_url) {
        this.link_url = link_url;
    }

    public String getLink_api() {
        return this.link_api;
    }

    public void setLink_api(String link_api) {
        this.link_api = link_api;
    }

    public Publisher getPublisher() {
        return this.publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    public Publication getPublication() {
        return this.publication;
    }

    public void setPublication(Publication publication) {
        this.publication = publication;
    }

    public String getCtype() {
        return this.ctype;
    }

    public void setCtype(String ctype) {
        this.ctype = ctype;
    }
}