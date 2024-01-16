package course;

import java.util.List;
import lombok.RequiredArgsConstructor;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbBean;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbPartitionKey;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbSortKey;

@DynamoDbBean
@RequiredArgsConstructor
public class Question {

  private final String courseId;
  private final String id;

  private final List<String> titles;
  private final List<String> answers;

  private final String pictureUri;

  @DynamoDbPartitionKey
  public String getCourseId() {
    return courseId;
  }

  @DynamoDbSortKey
  public String getId() {
    return id;
  }
}
