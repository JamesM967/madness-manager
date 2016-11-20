package org.srang.bracketpicker.model;

import lombok.Data;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import java.io.Serializable;

/**
 * Created by srang on 11/5/2016.
 */
@Data
@Entity
@EntityListeners(AuditingEntityListener.class)
public class Score implements Serializable {
    Integer scoreId;
    Integer ruelsetId;
    Integer bracketId;
    Integer score;
}
