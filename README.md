# JAVA-Garbage-Collection
자바의 가비지 컬렉션에 대한 내용을 담았습니다.


자바의 가비지 컬렉션(Garbage Collection)은 자동 메모리 관리 기능으로, 프로그램에서 사용되지 않는 객체를 식별하여 자동으로 메모리에서 해제하는 프로세스입니다. 가비지 컬렉션은 개발자가 명시적으로 메모리를 해제하지 않아도 됨으로써 프로그래밍 과정을 단순화하고, 메모리 누수나 잘못된 메모리 관리로 인한 버그를 방지하는 데 도움을 줍니다.

아래는 가비지 컬렉션에 대한 자세한 설명입니다.

- 가비지 컬렉션의 작동 원리:

가비지 컬렉션은 자바 가상 머신(JVM)에 의해 관리됩니다. JVM은 프로그램 실행 도중에 메모리 사용을 모니터링하고, 더 이상 참조되지 않는 객체를 식별하여 메모리에서 해제합니다.
가비지 컬렉션은 주기적으로 또는 필요할 때마다 실행될 수 있습니다. JVM은 자체적으로 가비지 컬렉션 실행 시점을 결정하며, 개발자가 직접 제어할 수 없습니다.

- 객체의 생존 여부 결정:

가비지 컬렉션은 참조되지 않는 객체를 식별하여 메모리에서 제거합니다. 객체의 생존 여부는 'Reachability(도달 가능성)'라는 개념에 기반합니다.
도달 가능한 객체는 다른 객체로부터 직간접적인 참조를 받는 객체입니다. 도달 가능한 객체는 프로그램의 실행 흐름 상에서 접근 가능하므로 가비지 컬렉션의 대상이 되지 않습니다.
도달 가능하지 않은 객체는 더 이상 참조되지 않는 객체로 판단하고, 가비지 컬렉션의 대상이 됩니다.

- 가비지 컬렉션 알고리즘:

가비지 컬렉션은 일반적으로 다음 두 가지 알고리즘 중 하나를 사용합니다.

'Mark and Sweep': 이 알고리즘은 객체의 도달 가능성을 확인하기 위해 가비지 컬렉션 실행 시 모든 객체를 훑으면서 참조 여부를 표시(mark)한 후, 표시되지 않은 객체를 메모리에서 해제(sweep)합니다.

'Copying': 이 알고리즘은 메모리를 두 개의 영역으로 나누고, 한 영역에 있는 객체를 다른 영역으로 복사하는 방식으로 가비지 컬렉션을 수행합니다. 복사 중에 도달 가능한 객체만을 복사하고, 복사가 완료된 영역의 객체를 모두 해제합니다.
이 외에도 다른 가비지 컬렉션 알고리즘들이 존재하며, JVM 구현에 따라 다양한 가비지 컬렉션 알고리즘을 조합하여 사용할 수 있습니다.

- 가비지 컬렉션의 장단점:

장점:
메모리 누수와 같은 일반적인 메모리 관리 버그를 방지합니다.
개발자가 메모리 해제를 명시적으로 처리할 필요가 없으므로 개발 생산성을 향상시킵니다.
동적 메모리 할당과 해제로 인한 프로그래밍 오류를 줄일 수 있습니다.

단점:
가비지 컬렉션은 실행 시점과 주기를 개발자가 제어할 수 없으므로, 일부 상황에서는 예측할 수 없는 지연이 발생할 수 있습니다.
가비지 컬렉션 작업을 수행하면 프로세스의 일시 중단이 필요할 수 있으며, 이는 실시간 응용 프로그램과 같은 특정 환경에서 문제가 될 수 있습니다.

가비지 컬렉션은 자바의 중요한 기능 중 하나이며, 메모리 관리 부담을 줄여줌으로써 안정적이고 효율적인 프로그램 실행을 가능하게 합니다.