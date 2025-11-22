#include <iostream>

class Person {
private:
    std::string name;
    unsigned int age;
    void (*ability)();
public:
    Person(std::string name, unsigned int age, void(*ability)()) {
        this->name = name;
        this->age = age;
        this->ability = ability;
    }

    void useAbility(){
        (*ability)();
    }
};
typedef class Person Per;

int add(int a, int b) {
    return a + b;
}
void proclaim(){
    std::cout << "I rule!!!" << std::endl;
}

int main() {

    Person person1 = Person("Maldor", 425, proclaim);
    person1.useAbility();
    return 0;
}