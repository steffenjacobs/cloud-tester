package me.steffenjacobs.cloudtester;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class GeneratedId {
  @Id
  private UUID uuid;
  @Column(name = "instance_id")
  private long instanceId;
}
