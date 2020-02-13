package jc01_2020.lesson08.task02;

/*
 *
 * На вход подается массив объектов Object. Реализовать статический параметризованный метод filter(), который принимает
 * в качестве параметров исходный массив и реализацию анонимного класса Filter и возвращает массив, состоящий только из
 * элементов, являющихся наследниками класса Number (для проверки используется ключевое слово instanceOf)
 *
 */

public class Application {

	static class Cat {
	}

	interface Filter {
		boolean apply(Object o);
	}

	public static void main(String[] args) {
		Object[] array = {"String", 1, 2.0, new Cat(), 85L, new Cat()};

	}


}
