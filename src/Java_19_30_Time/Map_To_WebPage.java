package Java_19_30_Time;

import java.util.*;

class Pagination {
    private int page;
    private int list_count_in_page;
    private int list_count;

    Pagination(int page, int list_count_in_page, int list_count) {
        this.list_count = list_count;
        this.page = page;
        this.list_count_in_page = list_count_in_page;
    }

    public ArrayList<Document> getPages(ArrayList<Document> documents){
        ArrayList<Document> filtered = new ArrayList<>();

        int lastPage = this.page * this.list_count_in_page;
        lastPage = documents.size() < lastPage ? documents.size() : lastPage;

        for(int i=(this.page-1)*this.list_count_in_page ; i<lastPage ; i++){
            filtered.add(documents.get(i));
        }
        return filtered;
    }

}

class Document {
    public String title;
    private String author;
    private String content;
    private Date createdDate;

    Document(String title, String author, String content, Date createdDate){
        this.title = title;
        this.author = author;
        this.content = content;
        this.createdDate = createdDate;
    }

}


public class Map_To_WebPage {

    public static void main(String[] args) {

        Calendar cal = Calendar.getInstance();

        ArrayList<Document> documents = new ArrayList<>();
        documents.add(new Document("게시글 1", "작성자 A", "내용 A", new Date(cal.getTimeInMillis())));
        documents.add(new Document("게시글 2", "작성자 B", "내용 A", new Date(cal.getTimeInMillis())));
        documents.add(new Document("게시글 3", "작성자 C", "내용 A", new Date(cal.getTimeInMillis())));
        documents.add(new Document("게시글 4", "작성자 D", "내용 A", new Date(cal.getTimeInMillis())));
        documents.add(new Document("게시글 5", "작성자 E", "내용 A", new Date(cal.getTimeInMillis())));
        documents.add(new Document("게시글 6", "작성자 F", "내용 A", new Date(cal.getTimeInMillis())));
        documents.add(new Document("게시글 7", "작성자 G", "내용 A", new Date(cal.getTimeInMillis())));
        documents.add(new Document("게시글 8", "작성자 H", "내용 A", new Date(cal.getTimeInMillis())));
        documents.add(new Document("게시글 9", "작성자 I", "내용 A", new Date(cal.getTimeInMillis())));
        documents.add(new Document("게시글 10", "작성자 J", "내용 A", new Date(cal.getTimeInMillis())));
        documents.add(new Document("게시글 11", "작성자 K", "내용 A", new Date(cal.getTimeInMillis())));
        documents.add(new Document("게시글 12", "작성자 L", "내용 A", new Date(cal.getTimeInMillis())));
        documents.add(new Document("게시글 13", "작성자 M", "내용 A", new Date(cal.getTimeInMillis())));
        documents.add(new Document("게시글 14", "작성자 N", "내용 A", new Date(cal.getTimeInMillis())));
        documents.add(new Document("게시글 15", "작성자 O", "내용 A", new Date(cal.getTimeInMillis())));
        documents.add(new Document("게시글 16", "작성자 P", "내용 A", new Date(cal.getTimeInMillis())));
        documents.add(new Document("게시글 17", "작성자 Q", "내용 A", new Date(cal.getTimeInMillis())));
        documents.add(new Document("게시글 18", "작성자 R", "내용 A", new Date(cal.getTimeInMillis())));
        documents.add(new Document("게시글 19", "작성자 S", "내용 A", new Date(cal.getTimeInMillis())));

        Pagination pagination = new Pagination(2, 10, documents.size());
        ArrayList<Document> filtered = pagination.getPages(documents);

        for(int i=0 ; i<filtered.size() ; i++) {
            Document document = filtered.get(i);
            System.out.println(document.title);
        }
    }
}