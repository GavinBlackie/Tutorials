#include <iostream>
#include <vector>
#include <deque>
#include <list>
#include <set>

void messWithVector() {
    std::vector<std::string> food;

    food.push_back("Banana");
    food.push_back("Apple");
    food.push_back("Watermelon");

    for (int iVec=0; iVec < food.size(); iVec++){
        std::cout << food.at(iVec) << std::endl;
    }

    // vector<std::string>::iterator ptr;
    // for (ptr = food.begin(); )
}

void messWithDeq() {
    std::deque<int> deq;

    deq.push_back(12);
    deq.push_front(13);
    
    for (int iDeq=0; iDeq < deq.size(); iDeq++){
        std::cout << deq.at(iDeq) << std::endl;
    }
}

int main() {

    messWithVector();

    messWithDeq();


    // NOTE: sets are UNORDERED, so when you iterate through
    // them, do not expect particular order!

    std::set<char> grades;

    grades.insert('A');
    grades.insert('C');
    grades.insert('B');

    std::set<char>::const_iterator iSet = grades.begin();
    while (iSet != grades.end()){
        std::cout << *iSet << " ";
        ++iSet;
    }

    return 0;
}