package customer;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbBean;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbPartitionKey;

@DynamoDbBean
@RequiredArgsConstructor
public class User {

  private final String id;

  @Getter
  private final String firstName;
  @Getter
  private final String lastName;

  @DynamoDbPartitionKey
  public String getId() {
    return id;
  }
}
