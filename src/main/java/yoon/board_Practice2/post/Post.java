package yoon.board_Practice2.post;

import jakarta.persistence.*;
import yoon.board_Practice2.board.Board;

@Entity
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String title;

    private String content;

    private int viewCount = 0;

    @ManyToOne
    private Board board;

    public Post() {
    }

    public Post(String name, String title, String content, Board board) {
        this.name = name;
        this.title = title;
        this.content = content;
        this.board = board;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public int getViewCount() {
        return viewCount;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void viewCountIncrease(int viewCount) {
        this.viewCount++;
    }
}
