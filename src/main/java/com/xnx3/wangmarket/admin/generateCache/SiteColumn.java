package com.xnx3.wangmarket.admin.generateCache;

import org.springframework.stereotype.Component;
import com.xnx3.j2ee.generateCache.BaseGenerate;

/**
 * 站点栏目导航
 * @author 管雷鸣
 */
@Component
public class SiteColumn extends BaseGenerate {
	public SiteColumn() {
		used();
		type();
		editMode();
		listRank();
	}
	
	public void used(){
		createCacheObject("used");
		cacheAdd(com.xnx3.wangmarket.admin.entity.SiteColumn.USED_ENABLE, "显示");
		cacheAdd(com.xnx3.wangmarket.admin.entity.SiteColumn.USED_UNABLE, "隐藏");
		generateCacheFile();
	}
	
	public void type(){
		createCacheObject("type");
		cacheAdd(com.xnx3.wangmarket.admin.entity.SiteColumn.TYPE_NEWS, "新闻信息");
		cacheAdd(com.xnx3.wangmarket.admin.entity.SiteColumn.TYPE_IMAGENEWS, "图文信息");
		cacheAdd(com.xnx3.wangmarket.admin.entity.SiteColumn.TYPE_PAGE, "独立页面");
//		cacheAdd(com.xnx3.wangmarket.admin.entity.SiteColumn.TYPE_LEAVEWORD, "留言板");
		cacheAdd(com.xnx3.wangmarket.admin.entity.SiteColumn.TYPE_HREF, "超链接");
//		cacheAdd(com.xnx3.wangmarket.admin.entity.SiteColumn.TYPE_TEXT, "纯文字");
		generateCacheFile();
	}
	
	public void editMode(){
		createCacheObject("editMode");
		cacheAdd(com.xnx3.wangmarket.admin.entity.SiteColumn.EDIT_MODE_INPUT_MODEL, "图文编辑框");
		cacheAdd(com.xnx3.wangmarket.admin.entity.SiteColumn.EDIT_MODE_TEMPLATE, "模板式编辑");
		generateCacheFile();
	}
	
	/**
	 * 栏目内信息排序方式
	 */
	public void listRank(){
		createCacheObject("listRank");
		cacheAdd(com.xnx3.wangmarket.admin.entity.SiteColumn.LIST_RANK_ADDTIME_ASC, "发布时间正序");
		cacheAdd(com.xnx3.wangmarket.admin.entity.SiteColumn.LIST_RANK_ADDTIME_DESC, "发布时间倒序");
		generateCacheFile();
	}
}
