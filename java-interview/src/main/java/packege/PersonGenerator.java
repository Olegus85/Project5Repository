package packege;

public class PersonGenerator implements Generator<Person> {
    private static NameGenerator nameGenerator = new NameGenerator();
    private static AgeGenerator ageGenerator = new AgeGenerator();

    @Override
    public Person generate() {
        return new Person(nameGenerator.generate(), ageGenerator.generate());
    }
}
