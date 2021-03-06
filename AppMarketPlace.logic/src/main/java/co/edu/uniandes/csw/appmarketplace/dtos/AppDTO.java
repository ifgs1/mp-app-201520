package co.edu.uniandes.csw.appmarketplace.dtos;

import java.util.Date;
import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import uk.co.jemos.podam.common.PodamExclude;

/**
 * @generated
 */
@XmlRootElement
public class AppDTO {

    private Long id;
    private String name;
    private String description;
    private String version;
    private String picture;
    private Integer price;
    private Integer size;
    @PodamExclude
    private DeveloperDTO developer;
    private String platform;
    private Integer discount;
    private String category;
    @PodamExclude
    private List<CommentDTO> comments;
    private Double rate;
    private Long downloads;
    private boolean enabled;
    private String issueUrl;
    @XmlJavaTypeAdapter(DateAdapter.class)
    private Date startDiscountDate;
    @XmlJavaTypeAdapter(DateAdapter.class)
    private Date finishDiscountDate;
    @PodamExclude
    private List<MediaDTO> images;
    @PodamExclude
    private List<MediaDTO> videos;
    @PodamExclude
    private List<SourceDTO> sources;

    public String getIssueUrl() {
        return issueUrl;
    }

    public void setIssueUrl(String issueUrl) {
        this.issueUrl = issueUrl;
    }
    
    

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }
    
    public Date getStartDiscountDate() {
        return startDiscountDate;
    }

    public void setStartDiscountDate(Date startDiscountDate) {
        this.startDiscountDate = startDiscountDate;
    }

    public Date getFinishDiscountDate() {
        return finishDiscountDate;
    }

    public void setFinishDiscountDate(Date finishDiscountDate) {
        this.finishDiscountDate = finishDiscountDate;
    }

    /**
     * @generated
     */
    public Long getId() {
        return id;
    }

    /**
     * @generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @generated
     */
    public String getName() {
        return name;
    }

    /**
     * @generated
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @generated
     */
    public String getDescription() {
        return description;
    }

    /**
     * @generated
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @generated
     */
    public String getVersion() {
        return version;
    }

    /**
     * @generated
     */
    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * @generated
     */
    public String getPicture() {
        return picture;
    }

    /**
     * @generated
     */
    public void setPicture(String picture) {
        this.picture = picture;
    }

    /**
     * @generated
     */
    public Integer getPrice() {
        return price;
    }

    /**
     * @generated
     */
    public void setPrice(Integer price) {
        this.price = price;
    }

    /**
     * @generated
     */
    public Integer getSize() {
        return size;
    }

    /**
     * @generated
     */
    public void setSize(Integer size) {
        this.size = size;
    }

    /**
     * @generated
     */
    public DeveloperDTO getDeveloper() {
        return developer;
    }

    /**
     * @generated
     */
    public void setDeveloper(DeveloperDTO developer) {
        this.developer = developer;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public Integer getDiscount() {
        return discount;
    }

    public void setDiscount(Integer discount) {
        this.discount = discount;
    }

    public List<CommentDTO> getComments() {
        return comments;
    }

    public void setComments(List<CommentDTO> comments) {
        this.comments = comments;
    }

    /**
     * @return the category
     */
    public String getCategory() {
        return category;
    }

    /**
     * @param category the category to set
     */
    public void setCategory(String category) {
        this.category = category;
    }

    public Double getRate() {
        return rate;
    }

    public void setRate(Double rate) {
        this.rate = rate;
    }

    public Long getDownloads() {
        return downloads;
    }

    public void setDownloads(Long downloads) {
        this.downloads = downloads;
    }

    public List<MediaDTO> getImages() {
        return images;
    }

    public void setImages(List<MediaDTO> images) {
        this.images = images;
    }

    public List<MediaDTO> getVideos() {
        return videos;
    }

    public void setVideos(List<MediaDTO> videos) {
        this.videos = videos;
    }

    public List<SourceDTO> getSources() {
        return sources;
    }

    public void setSources(List<SourceDTO> sources) {
        this.sources = sources;
    }
}