package com.mikescherbakov.languagetrainermodel.course;

import com.mikescherbakov.languagetrainermodel.common.Language;
import lombok.RequiredArgsConstructor;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbBean;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbPartitionKey;

@DynamoDbBean
@RequiredArgsConstructor
public class Course {

  private final String id;

  private final Language fromLanguage;
  private final Language toLanguage;

  @DynamoDbPartitionKey
  public String getId() {
    return id;
  }
}
