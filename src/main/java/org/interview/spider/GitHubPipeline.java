package org.interview.spider;

import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import us.codecraft.webmagic.Task;
import us.codecraft.webmagic.pipeline.PageModelPipeline;

import java.util.Objects;

@Slf4j
public class GitHubPipeline implements PageModelPipeline {
    @Override
    public void process(Object githubRepo, Task task) {


        log.info("爬取结果：[{}]", JSONObject.toJSONString(githubRepo));
        log.info(task.getUUID());
        log.info(task.getSite().getDomain());


    }
}
