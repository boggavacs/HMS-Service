package com.hms.experience.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "job_listings")
public class JobEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "company")
    private String company;

    @Column(name = "title")
    private String title;

    @Column(name = "category_id")
    private String category_id;

    @Column(name = "location")
    private String location;

    @Column(name = "short_description")
    private String short_description;

    @Column(name = "long_description")
    private String long_description;

    @Column(name = "instructions")
    private String instructions;

    @Column(name = "status")
    private String status;

    @Column(name = "job_listing_type")
    private String job_listing_type;

    @Column(name = "created_at")
    private LocalDateTime created_at;

    @Column(name = "updated_at")
    private LocalDateTime updated_at;

    @Column(name = "expires_at")
    private LocalDateTime expires_at;

    public JobEntity() {
    }

    public JobEntity(int id, String company, String title, String long_description, String location,
            String short_description, String category_id, String instructions, String status,
            String job_listing_type, LocalDateTime created_at, LocalDateTime updated_at, LocalDateTime expires_at) {
        this.id = id;
        this.company = company;
        this.title = title;
        this.category_id = category_id;
        this.location = location;
        this.short_description = short_description;
        this.long_description = long_description;
        this.instructions = instructions;
        this.status = status;
        this.job_listing_type = job_listing_type;
        this.created_at = created_at;
        this.updated_at = updated_at;
        this.expires_at = expires_at;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory_id() {
        return category_id;
    }

    public void setCategory_id(String category_id) {
        this.category_id = category_id;
    }

    public String getLocaion() {
        return location;
    }

    public void setLocaion(String locaion) {
        this.location = locaion;
    }

    public String getShort_description() {
        return short_description;
    }

    public void setShort_description(String short_description) {
        this.short_description = short_description;
    }

    public String getLong_description() {
        return long_description;
    }

    public void setLong_description(String long_description) {
        this.long_description = long_description;
    }

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getJob_listing_type() {
        return job_listing_type;
    }

    public void setJob_listing_type(String job_listing_type) {
        this.job_listing_type = job_listing_type;
    }

    public LocalDateTime getCreated_at() {
        return created_at;
    }

    public void setCreated_at(LocalDateTime created_at) {
        this.created_at = created_at;
    }

    public LocalDateTime getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(LocalDateTime updated_at) {
        this.updated_at = updated_at;
    }

    public LocalDateTime getExpires_at() {
        return expires_at;
    }

    public void setExpires_at(LocalDateTime expires_at) {
        this.expires_at = expires_at;
    }

    @Override
    public String toString() {
        return "JobListing [id=" + id + ", company=" + company + ", title=" + title + ", category_id=" + category_id
                + ", locaion=" + location + ", short_description=" + short_description + ", long_description="
                + long_description + ", instructions=" + instructions + ", status=" + status + ", job_listing_type="
                + job_listing_type + ", created_at=" + created_at + ", updated_at=" + updated_at + ", expires_at="
                + expires_at + "]";
    }

}
