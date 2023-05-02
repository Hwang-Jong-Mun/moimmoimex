package JavaTree.moimmoim.domain;

import java.time.LocalDate;

public class MoimDo {
    private Long moimNum;
    private Long moimHostUserIdNum;
    private String moimTitle;
    private String moimMainContent;
    private String moimImage;
    private LocalDate moimCreateDate;
    private int moimViewCount;
    private int moimCategoryNum;
    private LocalDate moimStartDate;
    private LocalDate moimEndDate;
    private LocalDate moimDeadLine;
    private int moimMemberCount;
    private int moimMemberMax;
    private int moimPrice;
    // private LocalDate moimJoinDate;
    private int moimDeadCheck;
    private int moimLocationNum;

    public MoimDo(Long moimNum, Long moimHostUserIdNum, String moimTitle, String moimMainContent, String moimImage, LocalDate moimCreateDate, int moimViewCount, int moimCategoryNum, LocalDate moimStartDate, LocalDate moimEndDate, LocalDate moimDeadLine, int moimMemberCount, int moimMemberMax, int moimPrice, int moimDeadCheck, int moimLocationNum) {
        this.moimNum = moimNum;
        this.moimHostUserIdNum = moimHostUserIdNum;
        this.moimTitle = moimTitle;
        this.moimMainContent = moimMainContent;
        this.moimImage = moimImage;
        this.moimCreateDate = moimCreateDate;
        this.moimViewCount = moimViewCount;
        this.moimCategoryNum = moimCategoryNum;
        this.moimStartDate = moimStartDate;
        this.moimEndDate = moimEndDate;
        this.moimDeadLine = moimDeadLine;
        this.moimMemberCount = moimMemberCount;
        this.moimMemberMax = moimMemberMax;
        this.moimPrice = moimPrice;
        this.moimDeadCheck = moimDeadCheck;
        this.moimLocationNum = moimLocationNum;
    }

    public Long getMoimNum() {
        return moimNum;
    }

    public void setMoimNum(Long moimNum) {
        this.moimNum = moimNum;
    }

    public Long getMoimHostUserIdNum() {
        return moimHostUserIdNum;
    }

    public void setMoimHostUserIdNum(Long moimHostUserIdNum) {
        this.moimHostUserIdNum = moimHostUserIdNum;
    }

    public String getMoimTitle() {
        return moimTitle;
    }

    public void setMoimTitle(String moimTitle) {
        this.moimTitle = moimTitle;
    }

    public String getMoimMainContent() {
        return moimMainContent;
    }

    public void setMoimMainContent(String moimMainContent) {
        this.moimMainContent = moimMainContent;
    }

    public String getMoimImage() {
        return moimImage;
    }

    public void setMoimImage(String moimImage) {
        this.moimImage = moimImage;
    }

    public LocalDate getMoimCreateDate() {
        return moimCreateDate;
    }

    public void setMoimCreateDate(LocalDate moimCreateDate) {
        this.moimCreateDate = moimCreateDate;
    }

    public int getMoimViewCount() {
        return moimViewCount;
    }

    public void setMoimViewCount(int moimViewCount) {
        this.moimViewCount = moimViewCount;
    }

    public int getMoimCategoryNum() {
        return moimCategoryNum;
    }

    public void setMoimCategoryNum(int moimCategoryNum) {
        this.moimCategoryNum = moimCategoryNum;
    }

    public LocalDate getMoimStartDate() {
        return moimStartDate;
    }

    public void setMoimStartDate(LocalDate moimStartDate) {
        this.moimStartDate = moimStartDate;
    }

    public LocalDate getMoimEndDate() {
        return moimEndDate;
    }

    public void setMoimEndDate(LocalDate moimEndDate) {
        this.moimEndDate = moimEndDate;
    }

    public LocalDate getMoimDeadLine() {
        return moimDeadLine;
    }

    public void setMoimDeadLine(LocalDate moimDeadLine) {
        this.moimDeadLine = moimDeadLine;
    }

    public int getMoimMemberCount() {
        return moimMemberCount;
    }

    public void setMoimMemberCount(int moimMemberCount) {
        this.moimMemberCount = moimMemberCount;
    }

    public int getMoimMemberMax() {
        return moimMemberMax;
    }

    public void setMoimMemberMax(int moimMemberMax) {
        this.moimMemberMax = moimMemberMax;
    }

    public int getMoimPrice() {
        return moimPrice;
    }

    public void setMoimPrice(int moimPrice) {
        this.moimPrice = moimPrice;
    }

    public int getMoimDeadCheck() {
        return moimDeadCheck;
    }

    public void setMoimDeadCheck(int moimDeadCheck) {
        this.moimDeadCheck = moimDeadCheck;
    }

    public int getMoimLocationNum() {
        return moimLocationNum;
    }

    public void setMoimLocationNum(int moimLocationNum) {
        this.moimLocationNum = moimLocationNum;
    }
}
