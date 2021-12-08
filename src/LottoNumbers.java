import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LottoNumbers {

    private final List<LottoNumber> numbers;

    public LottoNumbers(List<LottoNumber> lottoNumbers) {
        this.numbers = new ArrayList<>(lottoNumbers);
    }

    public void qweqwe(LottoWinningNumber lottoWinningNumber) {
        for (LottoNumber number : numbers) {
            lottoWinningNumber.handOver(number);
        }
    }

    public List<LottoNumber> getNumbers() {
        return Collections.unmodifiableList(numbers);
    }
}
