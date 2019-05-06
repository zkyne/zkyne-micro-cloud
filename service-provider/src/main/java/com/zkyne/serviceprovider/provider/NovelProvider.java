package com.zkyne.serviceprovider.provider;

import com.zkyne.serviceprovider.entity.Novel;
import com.zkyne.serviceprovider.entity.Provider;
import com.zkyne.serviceprovider.service.INovelService;
import com.zkyne.serviceprovider.service.IProviderService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName: NovelProvider
 * @Description:
 * @Author: zhangkunjsww
 * @Date: 2019/4/24 14:13
 */
@RestController
public class NovelProvider {

    @Resource
    private INovelService novelService;
    @Resource
    private IProviderService providerService;
    @RequestMapping("selectNovelById")
    public Novel selectNovel(Long novelId){
        return novelService.selectById(novelId);
    }

    @RequestMapping("selectProviderByCode")
    public List<Provider> selectProviderByCode(String code){
        return providerService.selectByCode(code);
    }


}
