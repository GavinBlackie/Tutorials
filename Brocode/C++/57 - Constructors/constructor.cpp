#include <iostream> // cin cout cerr clog

class Student {
    std::string _name;
    int _age;
    double _gpa;
    bool _isFullTime;
public:
    Student(std::string name, int age, double gpa) {
        // (*this).name = name;
        // this->_name = name; // only need this if names are the same

        _name = name;
        _age = age;
        _gpa = gpa;
        _isFullTime = true; // A defaulted value
    }

    ~Student(){
        std::cout << "Deleting a student" << std::endl;
    }

    void printAttributes() {
        std::cout << std::endl << "------Student Obj Attributes-----" << std::endl;
        std::cout << "Name: \t\t" << _name << std::endl;
        std::cout << "Age: \t\t" << _age << std::endl;
        std::cout << "GPA: \t\t" << _gpa << std::endl;
        std::string fullTimeMsg = _isFullTime ? "True" : "False";
        std::cout << "isFullTime: \t" << fullTimeMsg << std::endl;
    }

    inline std::string getName() {return _name;}
    inline int getAge() {return _age;}
    inline double getGpa() {return _gpa;}
    inline bool getFullTime() {return _isFullTime;}

    void setFullTime(bool isFullTime) {
        _isFullTime = isFullTime;
    }

};

typedef Student Stu;

int main() {

    // constructor = special method automatically called when obj instantiated
    //               Is useful for assigning values to attributes
    //               Also a frequently overloaded function

    //class Student student1;
    // New student on the STACK
    Student student1 = Student("Spongebob", 30, 2.7);

    student1.printAttributes();

    // New student on the HEAP
    Student* student2 = new Student("Patrick", 35, 1.7);

    student2->setFullTime(false);
    student2->printAttributes(); // (*student2).printAttributes();

    delete student2; // Free up the heap memory space
    student2 = NULL; // Avoid dangling pointers

    // Student pointer-pointer, calloc for 1 time
    Student** student3 = new Student*[1];

    *student3 = new Student("Sandy", 29, 3.9);

    (*student3)->setFullTime(false);
    (*student3)->printAttributes();

    // Free up memory at first index
    delete *student3;

    return 0;
}