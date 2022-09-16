package hello.hellospring.domain.searchMyGreenPet.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class GreenPickRequeestDTO {
    private String name;
    private String qstndlevel1;
    private String qstndlevel2;
    private String qstndlevel3;
    private String qstndlevel4;
    private String qoptlevel;

    //opt level
    //잎색
    private String lfclr_green;
    private String lfclr_yellow;
    private String lfclr_white;
    private String lfclr_red;
    private String lfclr_and;

    //잎무늬
    private String lfptrn_stripe;
    private String lfptrn_dot;
    private String lfptrn_edge;
    private String lfptrn_and;

    //꽃색
    private String flwclr_green;
    private String flwclr_white;
    private String flwclr_yellow;
    private String flwclr_red;
    private String flwclr_orange;
    private String flwclr_blue;
    private String flwclr_and;

    //생장속도
    private String grwspd_slow;
    private String grwspd_average;
    private String grwspd_fast;

//    public PickGreen toPickGreen(Account userId, Recruit recruitId){
//        return Apply.builder()
//                .account(userId)
//                .applyMessage(applyMessage)
//                .recruit(recruitId)
//                .build();
//    }
}
