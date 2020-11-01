package reactive;

import com.alibaba.fastjson.JSON;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.ObjectProvider;
import reactor.core.publisher.Flux;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author jinlei
 * @Description
 * @Date
 **/
public class ReactorTest {

        public static void main(String[] args) {

            List<Person> personList = new ArrayList<>();
            personList.add(Person.builder().id(1).data("1s").build());
            personList.add(Person.builder().id(1).data("2s").build());
            personList.add(Person.builder().id(1).data("11s").build());
            personList.add(Person.builder().id(1).data("3s").build());
            personList.add(Person.builder().id(1).data("111s").build());
            personList.add(Person.builder().id(1).data("22s").build());
            personList.add(Person.builder().id(1).data("33s").build());
            personList.add(Person.builder().id(1).data("1111s").build());

            Flux flux = Flux.fromStream(personList.stream());
            flux.buffer(5).subscribe(list -> System.out.println(JSON.toJSONString(list)));

            Flux flux1 = Flux.fromIterable(personList);
            flux1.buffer(5).subscribe(list -> System.out.println(JSON.toJSONString(list)));
        }

        static class Person{
            Integer id;

            String data;

            public Person(Integer id,String data){
                this.id = id;
                this.data = data;
            }

            static PersonBuilder builder(){
                return new PersonBuilder();
            }

            public Integer getId() {
                return id;
            }

            public void setId(Integer id) {
                this.id = id;
            }

            public String getData() {
                return data;
            }

            public void setData(String data) {
                this.data = data;
            }

            @Override
            public String toString() {
                return "Person{" +
                        "id=" + id +
                        ", data='" + data + '\'' +
                        '}';
            }
        }

        static class PersonBuilder{

            Integer id;

            String data;

            public PersonBuilder id(Integer id){
                this.id = id;
                return this;
            }

            public PersonBuilder data(String data){
                this.data = data;
                return this;
            }

            public Person build(){
                return new Person(id,data);
            }
        }
}
