package huating.com.entity;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "t_goods_img", schema = "ssm", catalog = "")
public class TGoodsImgEntity {
    private long id;
    private Long tGoodId;
    private String tImgName;
    private String tUrl;
    private String createdBy;
    private Timestamp createdTime;
    private String lastModifiedBy;
    private Timestamp lastModifiedTime;
    private Integer valid;
    private String remark;

    @Id
    @Column(name = "id", nullable = false)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "t_good_id", nullable = true)
    public Long gettGoodId() {
        return tGoodId;
    }

    public void settGoodId(Long tGoodId) {
        this.tGoodId = tGoodId;
    }

    @Basic
    @Column(name = "t_img_name", nullable = true, length = 100)
    public String gettImgName() {
        return tImgName;
    }

    public void settImgName(String tImgName) {
        this.tImgName = tImgName;
    }

    @Basic
    @Column(name = "t_url", nullable = true, length = -1)
    public String gettUrl() {
        return tUrl;
    }

    public void settUrl(String tUrl) {
        this.tUrl = tUrl;
    }

    @Basic
    @Column(name = "created_by", nullable = true, length = 10)
    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    @Basic
    @Column(name = "created_time", nullable = true)
    public Timestamp getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Timestamp createdTime) {
        this.createdTime = createdTime;
    }

    @Basic
    @Column(name = "last_modified_by", nullable = true, length = 10)
    public String getLastModifiedBy() {
        return lastModifiedBy;
    }

    public void setLastModifiedBy(String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    @Basic
    @Column(name = "last_modified_time", nullable = true)
    public Timestamp getLastModifiedTime() {
        return lastModifiedTime;
    }

    public void setLastModifiedTime(Timestamp lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    @Basic
    @Column(name = "valid", nullable = true)
    public Integer getValid() {
        return valid;
    }

    public void setValid(Integer valid) {
        this.valid = valid;
    }

    @Basic
    @Column(name = "remark", nullable = true, length = 100)
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TGoodsImgEntity that = (TGoodsImgEntity) o;

        if (id != that.id) return false;
        if (tGoodId != null ? !tGoodId.equals(that.tGoodId) : that.tGoodId != null) return false;
        if (tImgName != null ? !tImgName.equals(that.tImgName) : that.tImgName != null) return false;
        if (tUrl != null ? !tUrl.equals(that.tUrl) : that.tUrl != null) return false;
        if (createdBy != null ? !createdBy.equals(that.createdBy) : that.createdBy != null) return false;
        if (createdTime != null ? !createdTime.equals(that.createdTime) : that.createdTime != null) return false;
        if (lastModifiedBy != null ? !lastModifiedBy.equals(that.lastModifiedBy) : that.lastModifiedBy != null)
            return false;
        if (lastModifiedTime != null ? !lastModifiedTime.equals(that.lastModifiedTime) : that.lastModifiedTime != null)
            return false;
        if (valid != null ? !valid.equals(that.valid) : that.valid != null) return false;
        if (remark != null ? !remark.equals(that.remark) : that.remark != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (tGoodId != null ? tGoodId.hashCode() : 0);
        result = 31 * result + (tImgName != null ? tImgName.hashCode() : 0);
        result = 31 * result + (tUrl != null ? tUrl.hashCode() : 0);
        result = 31 * result + (createdBy != null ? createdBy.hashCode() : 0);
        result = 31 * result + (createdTime != null ? createdTime.hashCode() : 0);
        result = 31 * result + (lastModifiedBy != null ? lastModifiedBy.hashCode() : 0);
        result = 31 * result + (lastModifiedTime != null ? lastModifiedTime.hashCode() : 0);
        result = 31 * result + (valid != null ? valid.hashCode() : 0);
        result = 31 * result + (remark != null ? remark.hashCode() : 0);
        return result;
    }
}
