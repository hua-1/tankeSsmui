package huating.com.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Arrays;

@Entity
@Table(name = "t_goods_img_relation", schema = "ssm", catalog = "")
public class TGoodsImgRelationEntity {
    private long id;
    private String tDescribe;
    private String createdBy;
    private Timestamp createdTime;
    private String lastModifiedBy;
    private Timestamp lastModifiedTime;
    private String headImg;
    private Long tGoodsId;
    private byte[] imgAddress;
    private String tGoodName;
    private Integer tNumber;
    private BigDecimal tPrice;
    private Long categoryId;
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
    @Column(name = "t_describe", nullable = true, length = 1000)
    public String gettDescribe() {
        return tDescribe;
    }

    public void settDescribe(String tDescribe) {
        this.tDescribe = tDescribe;
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
    @Column(name = "head_img", nullable = true, length = 1000)
    public String getHeadImg() {
        return headImg;
    }

    public void setHeadImg(String headImg) {
        this.headImg = headImg;
    }

    @Basic
    @Column(name = "t_goods_id", nullable = true)
    public Long gettGoodsId() {
        return tGoodsId;
    }

    public void settGoodsId(Long tGoodsId) {
        this.tGoodsId = tGoodsId;
    }

    @Basic
    @Column(name = "img_address", nullable = true)
    public byte[] getImgAddress() {
        return imgAddress;
    }

    public void setImgAddress(byte[] imgAddress) {
        this.imgAddress = imgAddress;
    }

    @Basic
    @Column(name = "t_good_name", nullable = true, length = 50)
    public String gettGoodName() {
        return tGoodName;
    }

    public void settGoodName(String tGoodName) {
        this.tGoodName = tGoodName;
    }

    @Basic
    @Column(name = "t_number", nullable = true)
    public Integer gettNumber() {
        return tNumber;
    }

    public void settNumber(Integer tNumber) {
        this.tNumber = tNumber;
    }

    @Basic
    @Column(name = "t_price", nullable = true, precision = 2)
    public BigDecimal gettPrice() {
        return tPrice;
    }

    public void settPrice(BigDecimal tPrice) {
        this.tPrice = tPrice;
    }

    @Basic
    @Column(name = "category_id", nullable = true)
    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
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

        TGoodsImgRelationEntity that = (TGoodsImgRelationEntity) o;

        if (id != that.id) return false;
        if (tDescribe != null ? !tDescribe.equals(that.tDescribe) : that.tDescribe != null) return false;
        if (createdBy != null ? !createdBy.equals(that.createdBy) : that.createdBy != null) return false;
        if (createdTime != null ? !createdTime.equals(that.createdTime) : that.createdTime != null) return false;
        if (lastModifiedBy != null ? !lastModifiedBy.equals(that.lastModifiedBy) : that.lastModifiedBy != null)
            return false;
        if (lastModifiedTime != null ? !lastModifiedTime.equals(that.lastModifiedTime) : that.lastModifiedTime != null)
            return false;
        if (headImg != null ? !headImg.equals(that.headImg) : that.headImg != null) return false;
        if (tGoodsId != null ? !tGoodsId.equals(that.tGoodsId) : that.tGoodsId != null) return false;
        if (!Arrays.equals(imgAddress, that.imgAddress)) return false;
        if (tGoodName != null ? !tGoodName.equals(that.tGoodName) : that.tGoodName != null) return false;
        if (tNumber != null ? !tNumber.equals(that.tNumber) : that.tNumber != null) return false;
        if (tPrice != null ? !tPrice.equals(that.tPrice) : that.tPrice != null) return false;
        if (categoryId != null ? !categoryId.equals(that.categoryId) : that.categoryId != null) return false;
        if (valid != null ? !valid.equals(that.valid) : that.valid != null) return false;
        if (remark != null ? !remark.equals(that.remark) : that.remark != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (tDescribe != null ? tDescribe.hashCode() : 0);
        result = 31 * result + (createdBy != null ? createdBy.hashCode() : 0);
        result = 31 * result + (createdTime != null ? createdTime.hashCode() : 0);
        result = 31 * result + (lastModifiedBy != null ? lastModifiedBy.hashCode() : 0);
        result = 31 * result + (lastModifiedTime != null ? lastModifiedTime.hashCode() : 0);
        result = 31 * result + (headImg != null ? headImg.hashCode() : 0);
        result = 31 * result + (tGoodsId != null ? tGoodsId.hashCode() : 0);
        result = 31 * result + Arrays.hashCode(imgAddress);
        result = 31 * result + (tGoodName != null ? tGoodName.hashCode() : 0);
        result = 31 * result + (tNumber != null ? tNumber.hashCode() : 0);
        result = 31 * result + (tPrice != null ? tPrice.hashCode() : 0);
        result = 31 * result + (categoryId != null ? categoryId.hashCode() : 0);
        result = 31 * result + (valid != null ? valid.hashCode() : 0);
        result = 31 * result + (remark != null ? remark.hashCode() : 0);
        return result;
    }
}
