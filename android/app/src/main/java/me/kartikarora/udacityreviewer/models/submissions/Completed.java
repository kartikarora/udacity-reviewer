package me.kartikarora.udacityreviewer.models.submissions;

import android.support.annotation.NonNull;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

import me.kartikarora.udacityreviewer.models.certifications.Project;

/**
 * Developer: chipset
 * Package : me.kartikarora.udacityreviewer.models.submissions
 * Project : UdacityReviewer
 * Date : 2/6/17
 */

public class Completed implements Comparable<Completed> {

    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("result")
    @Expose
    private String result;
    @SerializedName("id")
    @Expose
    private long id;
    @SerializedName("rubric_id")
    @Expose
    private long rubricId;
    @SerializedName("user_id")
    @Expose
    private long userId;
    @SerializedName("grader_id")
    @Expose
    private long graderId;
    @SerializedName("notes")
    @Expose
    private Object notes;
    @SerializedName("repo_url")
    @Expose
    private Object repoUrl;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("updated_at")
    @Expose
    private String updatedAt;
    @SerializedName("commit_sha")
    @Expose
    private Object commitSha;
    @SerializedName("assigned_at")
    @Expose
    private String assignedAt;
    @SerializedName("price")
    @Expose
    private String price;
    @SerializedName("completed_at")
    @Expose
    private String completedAt;
    @SerializedName("archive_url")
    @Expose
    private String archiveUrl;
    @SerializedName("zipfile")
    @Expose
    private Zipfile zipfile;
    @SerializedName("udacity_key")
    @Expose
    private String udacityKey;
    @SerializedName("held_at")
    @Expose
    private Object heldAt;
    @SerializedName("status_reason")
    @Expose
    private Object statusReason;
    @SerializedName("result_reason")
    @Expose
    private Object resultReason;
    @SerializedName("type")
    @Expose
    private Object type;
    @SerializedName("training_id")
    @Expose
    private Object trainingId;
    @SerializedName("files")
    @Expose
    private List<Object> files = null;
    @SerializedName("url")
    @Expose
    private Object url;
    @SerializedName("annotation_urls")
    @Expose
    private List<Object> annotationUrls = null;
    @SerializedName("general_comment")
    @Expose
    private String generalComment;
    @SerializedName("hidden")
    @Expose
    private boolean hidden;
    @SerializedName("previous_submission_id")
    @Expose
    private Object previousSubmissionId;
    @SerializedName("nomination")
    @Expose
    private Object nomination;
    @SerializedName("language")
    @Expose
    private String language;
    @SerializedName("is_training")
    @Expose
    private boolean isTraining;
    @SerializedName("canary_metadata")
    @Expose
    private Object canaryMetadata;
    @SerializedName("project_id")
    @Expose
    private long projectId;
    @SerializedName("user")
    @Expose
    private User user;
    @SerializedName("grader")
    @Expose
    private Grader grader;
    @SerializedName("project")
    @Expose
    private Project project;
    @SerializedName("rubric")
    @Expose
    private Rubric rubric;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getRubricId() {
        return rubricId;
    }

    public void setRubricId(long rubricId) {
        this.rubricId = rubricId;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public long getGraderId() {
        return graderId;
    }

    public void setGraderId(long graderId) {
        this.graderId = graderId;
    }

    public Object getNotes() {
        return notes;
    }

    public void setNotes(Object notes) {
        this.notes = notes;
    }

    public Object getRepoUrl() {
        return repoUrl;
    }

    public void setRepoUrl(Object repoUrl) {
        this.repoUrl = repoUrl;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Object getCommitSha() {
        return commitSha;
    }

    public void setCommitSha(Object commitSha) {
        this.commitSha = commitSha;
    }

    public String getAssignedAt() {
        return assignedAt;
    }

    public void setAssignedAt(String assignedAt) {
        this.assignedAt = assignedAt;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getCompletedAt() {
        return completedAt;
    }

    public void setCompletedAt(String completedAt) {
        this.completedAt = completedAt;
    }

    public String getArchiveUrl() {
        return archiveUrl;
    }

    public void setArchiveUrl(String archiveUrl) {
        this.archiveUrl = archiveUrl;
    }

    public Zipfile getZipfile() {
        return zipfile;
    }

    public void setZipfile(Zipfile zipfile) {
        this.zipfile = zipfile;
    }

    public String getUdacityKey() {
        return udacityKey;
    }

    public void setUdacityKey(String udacityKey) {
        this.udacityKey = udacityKey;
    }

    public Object getHeldAt() {
        return heldAt;
    }

    public void setHeldAt(Object heldAt) {
        this.heldAt = heldAt;
    }

    public Object getStatusReason() {
        return statusReason;
    }

    public void setStatusReason(Object statusReason) {
        this.statusReason = statusReason;
    }

    public Object getResultReason() {
        return resultReason;
    }

    public void setResultReason(Object resultReason) {
        this.resultReason = resultReason;
    }

    public Object getType() {
        return type;
    }

    public void setType(Object type) {
        this.type = type;
    }

    public Object getTrainingId() {
        return trainingId;
    }

    public void setTrainingId(Object trainingId) {
        this.trainingId = trainingId;
    }

    public List<Object> getFiles() {
        return files;
    }

    public void setFiles(List<Object> files) {
        this.files = files;
    }

    public Object getUrl() {
        return url;
    }

    public void setUrl(Object url) {
        this.url = url;
    }

    public List<Object> getAnnotationUrls() {
        return annotationUrls;
    }

    public void setAnnotationUrls(List<Object> annotationUrls) {
        this.annotationUrls = annotationUrls;
    }

    public String getGeneralComment() {
        return generalComment;
    }

    public void setGeneralComment(String generalComment) {
        this.generalComment = generalComment;
    }

    public boolean getHidden() {
        return hidden;
    }

    public void setHidden(boolean hidden) {
        this.hidden = hidden;
    }

    public Object getPreviousSubmissionId() {
        return previousSubmissionId;
    }

    public void setPreviousSubmissionId(Object previousSubmissionId) {
        this.previousSubmissionId = previousSubmissionId;
    }

    public Object getNomination() {
        return nomination;
    }

    public void setNomination(Object nomination) {
        this.nomination = nomination;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public boolean getIsTraining() {
        return isTraining;
    }

    public void setIsTraining(boolean isTraining) {
        this.isTraining = isTraining;
    }

    public Object getCanaryMetadata() {
        return canaryMetadata;
    }

    public void setCanaryMetadata(Object canaryMetadata) {
        this.canaryMetadata = canaryMetadata;
    }

    public long getProjectId() {
        return projectId;
    }

    public void setProjectId(long projectId) {
        this.projectId = projectId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Grader getGrader() {
        return grader;
    }

    public void setGrader(Grader grader) {
        this.grader = grader;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public Rubric getRubric() {
        return rubric;
    }

    public void setRubric(Rubric rubric) {
        this.rubric = rubric;
    }

    @Override
    public int compareTo(@NonNull Completed other) {
        long value = other.getId() - this.getId();
        if (value > 0) return 1;
        else if (value < 0) return -1;
        else return 0;
    }
}