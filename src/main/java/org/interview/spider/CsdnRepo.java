package org.interview.spider;

import us.codecraft.webmagic.model.annotation.ExtractBy;
import us.codecraft.webmagic.model.annotation.HelpUrl;
import us.codecraft.webmagic.model.annotation.TargetUrl;



@TargetUrl("https://blog.csdn.net/\\w+/article/details/\\w+")
@HelpUrl("https://blog.csdn.net/nav/\\w+")
public class CsdnRepo {
    @ExtractBy(value = "//h1[@id='articleContentId']/strong/a/text()", notNull = true)
    private String name;
}
