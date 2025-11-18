#include <iostream>
#include <iomanip> // For setprecision

struct Student {
    std::string name;
    double gpa;
    bool isEnrolled;
};

int main() {

    // struct = A primitive structure that groups related vars
    //          under one name. Can contain many different values,
    //          (eg. strings, floats, ints, bools) known as members
    //
    //          Access members with . notation
    //
    //          Also, access struct pointers with arrow notation
    //          ( structPtr->membername = (*structPtr).membername )

    //          Remember: x64 & x32 memory banks!
    //          (For calculating struct byte space)

    // In C:
    struct Student student1;

    // In C++:
    Student student2;

    student2.name = "Patrick";
    student2.gpa = 2.4;
    student2.isEnrolled = true;

    std::cout << student2.name << std::endl;
    std::cout << std::fixed << std::setprecision(3) << student2.gpa << std::endl;
    std::cout << student2.isEnrolled << std::endl;

    Student student3 = {"Spongebob", 3.0, true};

    std::cout << student3.name << std::endl;
    std::cout << std::fixed << std::setprecision(3) << student3.gpa << std::endl;
    std::cout << student3.isEnrolled << std::endl;

    std::cout << student3.name.length() << std::endl;
    std::cout << sizeof(student3.name) << std::endl;
    std::cout << student3.name.size() << std::endl;

    return 0;
}