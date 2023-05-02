package javatreeex.moimmoimex.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MoimDo {
    private Long moimNum;
    private Long moimHostUserIdNum;
    private String moimTitle;
    private String moimMainContent;
    private String moimImage;
    private Date moimCreateDate;
    private int moimViewCount;
    private int moimCategoryNum;
    private Date moimStartDate;
    private Date moimEndDate;
    private Date moimDeadLine;
    private int moimMemberCount;
    private int moimMemberMax;
    private int moimPrice;
    private Date moimJoinDate;
    private int moimDeadCheck;
    private int moimLocationNum;
}
