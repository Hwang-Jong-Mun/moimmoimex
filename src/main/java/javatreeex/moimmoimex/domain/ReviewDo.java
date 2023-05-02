package JavaTree.moimmoim.domain;

import java.time.LocalDate;

public class ReviewDo {
    private Long reviewNum;
    private Long reviewWriterIdNum;
    private Long reviewMoimNum;
    private int reviewScore; //별점
    private String reviewContent;
    private String reviewTitle;
    private LocalDate reviewDate;


    public ReviewDo(Long reviewNum, Long reviewWriterIdNum, Long reviewMoimNum, int reviewScore, String reviewContent, String reviewTitle, LocalDate reviewDate) {
        this.reviewNum = reviewNum;
        this.reviewWriterIdNum = reviewWriterIdNum;
        this.reviewMoimNum = reviewMoimNum;
        this.reviewScore = reviewScore;
        this.reviewContent = reviewContent;
        this.reviewTitle = reviewTitle;
        this.reviewDate = reviewDate;
    }

    public Long getReviewNum() {
        return reviewNum;
    }

    public void setReviewNum(Long reviewNum) {
        this.reviewNum = reviewNum;
    }

    public Long getReviewWriterIdNum() {
        return reviewWriterIdNum;
    }

    public void setReviewWriterIdNum(Long reviewWriterIdNum) {
        this.reviewWriterIdNum = reviewWriterIdNum;
    }

    public Long getReviewMoimNum() {
        return reviewMoimNum;
    }

    public void setReviewMoimNum(Long reviewMoimNum) {
        this.reviewMoimNum = reviewMoimNum;
    }

    public int getReviewScore() {
        return reviewScore;
    }

    public void setReviewScore(int reviewScore) {
        this.reviewScore = reviewScore;
    }

    public String getReviewContent() {
        return reviewContent;
    }

    public void setReviewContent(String reviewContent) {
        this.reviewContent = reviewContent;
    }

    public String getReviewTitle() {
        return reviewTitle;
    }

    public void setReviewTitle(String reviewTitle) {
        this.reviewTitle = reviewTitle;
    }

    public LocalDate getReviewDate() {
        return reviewDate;
    }

    public void setReviewDate(LocalDate reviewDate) {
        this.reviewDate = reviewDate;
    }
}


