package v1.leetcode.arrays101;import org.assertj.core.api.Assertions;import org.junit.jupiter.api.BeforeEach;import org.junit.jupiter.api.Test;import java.util.List;class FindDisappearedNumbersTest {  FindDisappearedNumbers obj;  @BeforeEach  void setUp() {    obj = new FindDisappearedNumbers();  }  @Test  void name() {	  List<Integer> disappearedNumbers = obj.findDisappearedNumbers(new int[]{4, 3, 2, 7, 8, 2, 3, 1});	  Assertions.assertThat(disappearedNumbers).contains(5).contains(6);  }}