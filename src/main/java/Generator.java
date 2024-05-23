/**
 * Интерфейс для генерации чего-либо, например рандомного имени или рандомного числа
 *
 * @author: deski
 * Created: 22.05.2024
 */

public interface Generator<T> {

    T generate();

}