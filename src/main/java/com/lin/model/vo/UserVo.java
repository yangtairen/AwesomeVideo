package com.lin.model.vo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "用户视图对象", description = "这是用户视图对象")
public class UserVo {

    @ApiModelProperty(hidden = true)
    private String id;

    /**
     * 用户认证凭据
     */
    @ApiModelProperty(hidden = true)
    private String userToken;

    /**
     * 用户名
     */
    @ApiModelProperty(value = "用户名", name = "username", example = "jack", required = true)
    private String username;

    /**
     * 密码
     */
    @ApiModelProperty(value = "密码", name = "password", example = "123456", required = true)
    @JsonIgnore
    private String password;

    /**
     * 我的头像，如果没有默认给一张
     */
    @ApiModelProperty(hidden = true)
    private String faceImage;

    /**
     * 昵称
     */
    @ApiModelProperty(value = "昵称", name = "nickname", example = "jack123")
    private String nickname;

    /**
     * 我的粉丝数量
     */
    @ApiModelProperty(hidden = true)
    private Integer fansCounts;

    /**
     * 我关注的人总数
     */
    @ApiModelProperty(hidden = true)
    private Integer followCounts;

    /**
     * 我接受到的赞美/收藏 的数量
     */
    @ApiModelProperty(hidden = true)
    private Integer receiveLikeCounts;

    /**
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取用户认证凭据
     * @return 用户认证凭据
     */
    public String getUserToken() {
        return userToken;
    }

    /**
     * 设置用户认证凭据
     */
    public void setUserToken(String userToken) {
        this.userToken = userToken;
    }

    /**
     * 获取用户名
     *
     * @return username - 用户名
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置用户名
     *
     * @param username 用户名
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 获取密码
     *
     * @return password - 密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置密码
     *
     * @param password 密码
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取我的头像，如果没有默认给一张
     *
     * @return face_image - 我的头像，如果没有默认给一张
     */
    public String getFaceImage() {
        return faceImage;
    }

    /**
     * 设置我的头像，如果没有默认给一张
     *
     * @param faceImage 我的头像，如果没有默认给一张
     */
    public void setFaceImage(String faceImage) {
        this.faceImage = faceImage;
    }

    /**
     * 获取昵称
     *
     * @return nickname - 昵称
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * 设置昵称
     *
     * @param nickname 昵称
     */
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    /**
     * 获取我的粉丝数量
     *
     * @return fans_counts - 我的粉丝数量
     */
    public Integer getFansCounts() {
        return fansCounts;
    }

    /**
     * 设置我的粉丝数量
     *
     * @param fansCounts 我的粉丝数量
     */
    public void setFansCounts(Integer fansCounts) {
        this.fansCounts = fansCounts;
    }

    /**
     * 获取我关注的人总数
     *
     * @return follow_counts - 我关注的人总数
     */
    public Integer getFollowCounts() {
        return followCounts;
    }

    /**
     * 设置我关注的人总数
     *
     * @param followCounts 我关注的人总数
     */
    public void setFollowCounts(Integer followCounts) {
        this.followCounts = followCounts;
    }

    /**
     * 获取我接受到的赞美/收藏 的数量
     *
     * @return receive_like_counts - 我接受到的赞美/收藏 的数量
     */
    public Integer getReceiveLikeCounts() {
        return receiveLikeCounts;
    }

    /**
     * 设置我接受到的赞美/收藏 的数量
     *
     * @param receiveLikeCounts 我接受到的赞美/收藏 的数量
     */
    public void setReceiveLikeCounts(Integer receiveLikeCounts) {
        this.receiveLikeCounts = receiveLikeCounts;
    }
}