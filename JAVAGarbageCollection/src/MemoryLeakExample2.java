import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/*
 * 약한 참조를 사용하여 메모리 누수를 방지하는 예제입니다.
 */
public class MemoryLeakExample2 {
    private static List<WeakReference<Object>> list = new ArrayList<>();

    public static void main(String[] args) {
        while (true) {
            Object object = new Object();
            WeakReference<Object> weakRef = new WeakReference<>(object);
            list.add(weakRef);
        }
    }
}

/*
 * 위의 예제에서는 list에 WeakReference<Object> 타입으로 약한 참조를 저장합니다.
 * 약한 참조는 가비지 컬렉션의 대상이 될 수 있으므로, Object 객체들은 더 이상 강한 참조를 받지 않아도 메모리에서 해제될 수 있습니다.
 * 이를 통해 메모리 누수를 방지할 수 있습니다.
 */