package com.example.PixelPro.Bean;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CalendarBean {

    private Integer clid;
    private Integer clusername;
    private String clcalendar;
    private String cltitle;
    private String cldescription;
    private String clstart;
    private String clend;
    private String cllocation;
    private String cltype;
    private String clbackgroundcolor;
    private String clallday;
}
