package me.steffenjacobs.cloudtester;

import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.SecureRandom;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("api")
@RequiredArgsConstructor
public class CloudTesterController {

  private long instanceId;

  private final GeneratedIdRepository generatedIdRepository;

  @PostConstruct
  private void setupInstanceId() {
    this.instanceId = new SecureRandom().nextLong();
  }


  @GetMapping("uid")
  public GeneratedId generateId() {
    var generatedId = new GeneratedId(UUID.randomUUID(), instanceId);
    generatedIdRepository.save(generatedId);
    return generatedId;
  }

  @GetMapping("uid/log")
  public List<GeneratedId> listIds() {
    return generatedIdRepository.findAll();
  }
}
