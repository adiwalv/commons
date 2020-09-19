package com.adiwal.commons.audit;

import lombok.Getter;
import lombok.Setter;
import org.joda.time.DateTime;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

@Getter
@Setter
public class Audit {

    @CreatedDate
    public DateTime createdDate;


    @LastModifiedDate
    public DateTime lastModifiedDate;

    @CreatedBy
    public String createdBy;

    @LastModifiedBy
    public String lastModifiedBy;

}
