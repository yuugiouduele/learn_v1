package exam;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Strame1 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("ばか", "アホ", "間抜け");

		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i).toUpperCase();
			list.set(i, str);
		}

		Collections.sort(list);

		for (String str2 : list) {
			System.out.print(str2 + " ");
		}
		System.out.println("2");

		List<String> list2 = Arrays.asList("馬鹿", "阿呆", "マヌケ");
		list2.stream().sorted().map(s -> s.toUpperCase()).forEach(
				s -> System.out.println(s + "カス"));

		Stream<Integer> stream = Stream.of(10, 200, 3000);
		int result = stream.reduce(0, (a, b) -> a + b);
		System.out.println(result);

		BinaryOperator<Integer> operator = (a, b) -> a + b;
		Stream<Integer> stream1 = Stream.of(10, 200, 3000);
		Optional<Integer> result2 = stream1.reduce(operator);
		result2.ifPresent(System.out::println);

		Stream<Integer> stream2 = Stream.empty();
		Optional<Integer> result3 = stream2.reduce(operator);
		System.out.println(result3);
		result3.ifPresent(System.out::println);

		int[] ary1 = IntStream.range(1, 10).toArray();
		int[] ary2 = IntStream.rangeClosed(1, 10).toArray();
		Object[] ary3 = Stream.of("a", "b").toArray();
		String[] ary4 = Stream.of("a", "b").toArray(String[]::new);
		System.out.println(Arrays.toString(ary1));
		System.out.println(Arrays.toString(ary2));
		System.out.println(ary3.getClass());
		System.out.println(ary4.getClass());

		Optional<Integer> op1 = Optional.of(10);
		Optional<Integer> op2 = Optional.empty();
		System.out.println(op1.get());
		//		System.out.println(op2.get());
		System.out.println(op1.isPresent());
		System.out.println(op2.isPresent());
		System.out.println(op1.isEmpty());
		System.out.println(op2.isEmpty());

		List<String> data = Arrays.asList("うんこ", "便");
		Optional<String> op3 = data.stream().findFirst();
		Optional<String> op4 = data.stream().findAny();
		System.out.println(op3.get());
		System.out.println(op4.get());

		Stream<String> stream3 = Stream.empty();
		Optional<String> op5 = stream3.findFirst();
		op5.ifPresent(r -> System.out.println(r));

		Stream<Double> stream4 = Stream.empty();
		Optional<Double> op6 = stream4.findFirst();
		System.out.println(op6.orElse(0.0));
		System.out.println(op6.orElseGet((() -> Math.random())));
		//		System.out.println(op6.orElseThrow(IllegalArgumentException::new));

		Stream<String> stream5 = Stream.of("職場", "嫌い", "ウザイ");
		stream5.filter(s -> s.startsWith("ウ"))
				.forEach(x -> System.out.println(x));

		Stream<String> stream6 = Stream.of("職", "ba", "Biginner", "");
		stream6.filter(Predicate.not(s -> s.isEmpty()))
				.forEach(x -> System.out.println(x));

		Stream<String> stream7 = Stream.of("そろそろ", "疲れてきた", "ゴールド", "そろそろ");
		stream7.distinct()
				.forEach(x -> System.out.println(x));

		IntStream.iterate(1, n -> n + 1)
				.limit(10L)
				.forEach(x -> System.out.println(x));

		IntStream.rangeClosed(1, 10)
				.skip(5L)
				.forEach(x -> System.out.println(x));

		IntStream.iterate(1, n -> n + 1)
				.skip(100L)
				.limit(10L)
				.forEach(x -> System.out.println(x));

		Stream<String> stream8 = Stream.generate(() -> "うつ病");
		stream8.limit(7L)
				.forEach(x -> System.out.println(x));
		
		Stream<String>stream1a=Stream.of("上司","部下","後輩","メンドクセエ","役職とか","どうでもいい");
		Stream<String>stream1b=stream1a.map(s->s.toUpperCase());
		stream1b.forEach(x->System.out.println(x));
		
		Stream<String>stream2a=Stream.of("ふざけんな","sine","full");
		Stream<Integer>stream2b=stream2a.map(s->s.length());
		stream2b.forEach(i->System.out.println(i));
		
		IntStream stream3a=IntStream.of(1,2,3);
		IntStream stream3b=stream3a.map(i->i*10);
		stream3b.forEach(s->System.out.println(s));
		
		List<Integer>data1=Arrays.asList(10,20,30);
		List<Integer>data2=Arrays.asList(1,2,3);
		List<Integer>data3=Arrays.asList(100,200,300);
		List<List<Integer>>datalist=Arrays.asList(data1,data2,data3);
		datalist.stream()
		        .flatMap(d->d.stream())
		        .forEach(i->System.out.println(i));
		
		List<String>dataS=Stream.of("","huhu","kuku","223","##","??","\\","juju","kokokko")
				                .filter(s->s.length()>3)
				                .peek(i->System.out.println(i))
				                .distinct()
				                .peek(e->System.out.println(e))
				                .map(String::toUpperCase)
				                .peek(d->System.out.println(d))
				                .collect(Collectors.toList());
		System.out.println(dataS);
		
		Stream<String>stream9=Stream.of("佐藤","向井","深瀬","谷和原","池谷","千港");
		List<String>list1=stream9.collect(Collectors.toList());
		System.out.println(list1);
		
		Stream<String>stream10=Stream.of("佐藤","向井","深瀬","谷和原","池谷","千港");
		String st=stream10.collect(Collectors.joining("|"));
		System.out.println(st);
		
		Stream<String>stream11=Stream.of("佐藤","向井","深瀬","谷和原","池谷","千港");
		Integer suuji=stream11.collect(Collectors.summingInt(t->t.length()));
		System.out.println(suuji);
		
		Stream<String>stream12=Stream.of("佐藤","向井","深瀬","谷和原","池谷","千港");
		Double suuji1=stream12.collect(Collectors.averagingInt(t->t.length()));
		System.out.println(suuji1);
		

		Stream<String>stream13=Stream.of("佐藤","向井","深瀬","谷和原","池谷","千港");
		Map<Integer,String>map1=stream13.collect(Collectors.toMap(String::length,s->s,(s1,s2)->s1+":"+s2));
		//ソートキーの入れ方を指定しないといけない。
		System.out.println(map1);
		System.out.println(map1.getClass());
		
		Stream<String>stream14=Stream.of("佐藤","向井","深瀬","谷和原","池谷","千港");
		Map<String,List<String>>map2=stream14.collect(Collectors.groupingBy(s->s.substring(0,1)));
		System.out.println(map2);
		System.out.println(map2.getClass());
		
		Stream<Integer>stream15=Stream.of(15,35,6876,9487);
		Map<Boolean,Integer>map3=
				stream15.collect(
						Collectors.partitioningBy(
						s->s>50,
						Collectors.summingInt(n->n)));
		System.out.println(map3);
		
		Stream<String>stream16=Stream.of("胸毛","鼻毛","nonono","iisugu");
		String st2=stream16.collect(
						Collectors.mapping(
						s->s.toUpperCase(),
						Collectors.joining(":")));
		System.out.println(st2);
	}
}
