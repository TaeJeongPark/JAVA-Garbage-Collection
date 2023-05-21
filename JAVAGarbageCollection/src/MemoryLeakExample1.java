import java.util.ArrayList;
import java.util.List;

/*
 *  순환 참조로 인해 메모리 누수가 발생하는 예제입니다.
 */
public class MemoryLeakExample1 {
    private static List<Object> list = new ArrayList<>();

    public static void main(String[] args) {
        while (true) {
            Object object = new Object();
            list.add(object);
        }
    }
}

/*
 * 위의 예제는 MemoryLeakExample 클래스에서 Object 객체를 생성하고 list에 계속해서 추가하는 무한 루프를 실행합니다.
 * 이 예제에서는 list가 클래스의 정적 변수로 선언되어 있으며, Object 객체들은 list에 계속해서 추가됩니다.
 * 이 예제에서는 list에 추가된 Object 객체들이 가비지 컬렉션의 대상이 되지 않습니다.
 * 이는 list에 계속해서 참조가 추가되기 때문입니다.
 * 따라서 Object 객체들은 메모리에서 해제되지 않고 계속해서 쌓이게 되며, 메모리 누수가 발생합니다.
 * 이러한 상황에서는 순환 참조를 해제하거나 약한 참조(Weak Reference)를 사용하여 가비지 컬렉션의 동작을 조절할 수 있습니다.
 */