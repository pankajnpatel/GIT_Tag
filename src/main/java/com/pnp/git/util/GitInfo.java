package com.pnp.git.util;

/**
 *
 * @author Pankaj Patel
 * @version 1.0
 * @since 08/20/2014
 */
import java.util.ResourceBundle;

public class GitInfo {

    private static final String GIT_COMMIT_ID = "git.commit.id";
    private static final String GIT_COMMIT_NAME = "git.commit.user.name";
    private static final String GIT_COMMIT_EMAILID = "git.commit.user.email";
    private static final String GIT_COMMIT_SHORT = "git.commit.message.short";
    private static final String GIT_COMMIT_TIME = "git.commit.time";

    private static final String GIT_BRANCH = "git.branch";
    private static final String GIT_BUILD_NAME = "git.build.user.name";
    private static final String GIT_BUILD_EMAILID = "git.build.user.email";
    private static final String GIT_BUILD_TIME = "git.build.time";

    private ResourceBundle info;
    private String commit;
    private String commitShort;
    private String commitTime;
    private String committedBy;
    private String commitEmail;
    private String commitShortDesc;

    private String buildBranch;
    private String buildBy;
    private String buildEmail;
    private String buildTime;

    public GitInfo() {
        info = ResourceBundle.getBundle("git");
        commitTime = info.getString(GIT_COMMIT_TIME);
        commitShort = info.getString(GIT_COMMIT_ID) != null && info.getString(GIT_COMMIT_ID).length() > 17 ? info.getString(GIT_COMMIT_ID).substring(0, 17) + "..." : info.getString(GIT_COMMIT_ID);
        commit = info.getString(GIT_COMMIT_ID);
        committedBy = info.getString(GIT_COMMIT_NAME);
        commitEmail = info.getString(GIT_COMMIT_EMAILID);
        commitShortDesc = info.getString(GIT_COMMIT_SHORT);

        buildBranch = info.getString(GIT_BRANCH);
        buildBy = info.getString(GIT_BUILD_NAME);
        buildEmail = info.getString(GIT_BUILD_EMAILID);
        buildTime = info.getString(GIT_BUILD_TIME);
    }

    public String getCommit() {
        return commit;
    }

    public void setCommit(String revision) {
        this.commit = revision;
    }

    public String getCommitTime() {
        return commitTime;
    }

    public void setCommitTime(String commitTime) {
        this.commitTime = commitTime;
    }

    public ResourceBundle getInfo() {
        return info;
    }

    public void setInfo(ResourceBundle info) {
        this.info = info;
    }

    public String getCommittedBy() {
        return committedBy;
    }

    public void setCommittedBy(String committedBy) {
        this.committedBy = committedBy;
    }

    public String getCommitEmail() {
        return commitEmail;
    }

    public void setCommitEmail(String commitEmail) {
        this.commitEmail = commitEmail;
    }

    public String getCommitShortDesc() {
        return commitShortDesc;
    }

    public void setCommitShortDesc(String commitShortDesc) {
        this.commitShortDesc = commitShortDesc;
    }

    public String getCommitShort() {
        return commitShort;
    }

    public void setCommitShort(String commitShort) {
        this.commitShort = commitShort;
    }

    public String getBuildBranch() {
        return buildBranch;
    }

    public void setBuildBranch(String buildBranch) {
        this.buildBranch = buildBranch;
    }

    public String getBuildBy() {
        return buildBy;
    }

    public void setBuildBy(String buildBy) {
        this.buildBy = buildBy;
    }

    public String getBuildEmail() {
        return buildEmail;
    }

    public void setBuildEmail(String buildEmail) {
        this.buildEmail = buildEmail;
    }

    public String getBuildTime() {
        return buildTime;
    }

    public void setBuildTime(String buildTime) {
        this.buildTime = buildTime;
    }

}
