package com.dodo.privilege.entity.admin_1.videoad_3;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.DynamicInsert;

import com.dodo.common.annotation.DodoCodeGenerator;
import com.dodo.common.annotation.action.DodoAction;
import com.dodo.common.annotation.action.DodoActionGenerator;
import com.dodo.common.annotation.dao.DodoDaoGenerator;
import com.dodo.common.annotation.field.DodoField;
import com.dodo.common.annotation.field.DodoFileType;
import com.dodo.common.annotation.field.DodoShowColumn;
import com.dodo.common.annotation.menu.DodoMenu;
import com.dodo.common.annotation.menu.DodoMenuLevel;
import com.dodo.common.annotation.right.DodoRight;
import com.dodo.common.annotation.service.DodoSrvGenerator;
import com.dodo.common.framework.entity.BaseEntity;

/**
 * <p>
 * Dodo Framework. <a href="https://www.bydodo.com">https://www.bydodo.com</a>
 * 
 * @author uncle.code@bydodo.com
 * @author mingming@bydodo.com
 * @author dodo@bydodo.com
 * @version v 1.0
 */
@Entity
@DynamicInsert
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@DodoMenu(nameKey = "dodo.privilege.admin.menuNameKey", level = DodoMenuLevel.LEVEL1, sortSeq = 1)
@DodoMenu(nameKey = "dodo.privilege.admin.videoad.menuNameKey", level = DodoMenuLevel.LEVEL2, sortSeq = 3)
@DodoMenu(nameKey = "dodo.privilege.admin.videoad.VideoPreVideoAd.menuNameKey", level = DodoMenuLevel.LEVEL3, sortSeq = 1)
@DodoRight(nameKey = "dodo.privilege.admin.videoad.VideoPreVideoAd.entityKey")
@DodoCodeGenerator(daoGenerator = @DodoDaoGenerator, srvGenerator = @DodoSrvGenerator, actGenerator = @DodoActionGenerator(actions = { DodoAction.ALL }))
public class VideoPreVideoAd extends BaseEntity implements java.io.Serializable {
    private static final long serialVersionUID = 1505112379327096013L;

    @DodoField(sortSeq = -1, nameKey = "dodo.privilege.admin.videoad.VideoPreVideoAd.namekey.adTitle", isnullable = false, queryOnList = true)
    @DodoShowColumn(sortSeq = 0)
    private String            adTitle;

    @DodoField(sortSeq = 0, nameKey = "dodo.privilege.admin.videoad.VideoPreVideoAd.namekey.beginTime", dateFormat = "yyyy-MM-dd HH:mm:ss", isnullable = false)
    private Date              beginTime;

    @DodoField(sortSeq = 1, nameKey = "dodo.privilege.admin.videoad.VideoPreVideoAd.namekey.endTime", dateFormat = "yyyy-MM-dd HH:mm:ss", isnullable = false)
    private Date              endTime;

    @DodoField(sortSeq = 2, nameKey = "dodo.privilege.admin.videoad.VideoPreVideoAd.namekey.adFile", isnullable = false, isFile = true, fileType = { @DodoFileType(titleKey = "dodo.file.upload.titlekey.videos", extensions = "flv,mp4,mov,f4v,3gp") })
    private String            adFile;

    @DodoField(sortSeq = 3, nameKey = "dodo.privilege.admin.videoad.VideoPreVideoAd.namekey.adRealUrl", isnullable = false)
    private String            adRealUrl;

    public Date getBeginTime() {
        return beginTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    @Column(length = 1024)
    public String getAdFile() {
        return adFile;
    }

    @Column(length = 128)
    public String getAdRealUrl() {
        return adRealUrl;
    }

    public void setBeginTime(Date beginTime) {
        this.beginTime = beginTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public void setAdFile(String adFile) {
        this.adFile = adFile;
    }

    public void setAdRealUrl(String adRealUrl) {
        this.adRealUrl = adRealUrl;
    }

    @Column(length = 64)
    public String getAdTitle() {
        return adTitle;
    }

    public void setAdTitle(String adTitle) {
        this.adTitle = adTitle;
    }
}
