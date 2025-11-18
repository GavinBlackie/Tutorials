#include <iostream>
#include <vector> // must have this header!

void printVecI(std::vector<int>);

int main() {

    // vector = dynamic array. Can only contain 1 type of object.
    //          elements are stored beside each other in memory.
    //
    // NOTE: very similar to java arrays! 
    //
    // Vectors destroy their contents, but not the instances if the
    // contained content is pointers!
    //
    // They work with STL algorithms!


    // don't have to specify size on definition
    std::vector<float> vec1;
    std::vector<int> vec2 = {5, 6, 7, 1, 2, 3};

    // push_back    = add element to end of vector
    // size         = get size of vector (in size_t bytes)
    vec2.push_back(9);
    printVecI(vec2);

    // insert       = add element at particular index, pushes other stuff
    vec2.insert(vec2.begin() + 2, -8);
    printVecI(vec2);

    // begin        = get first "real" element index
    //                NOTE: does not give an actual int
    std::vector<int>::iterator a = vec2.begin();

    // can use index [i] (undefined behaviour if out-of-bounds)
    int iVec2 = 5;
    std::cout << "Vec2 at index " << iVec2 << " is: " << vec2[iVec2] << std::endl;

    // can use at(), diff. b/c of throwing exceptions
    iVec2 = 4;
    std::cout << "Vec2 at index " << iVec2 << " is: " << vec2.at(iVec2) << std::endl;

    // erase        = delete elment at specific index
    vec2.erase(vec2.begin() + 4);

    // pop_back     = delete backmost element
    vec2.pop_back();
    printVecI(vec2);
    
    // capacity     = total allocated memory in bytes
    
    // empty        = bool if vector is empty or not

    // clear        = remove all elements from vector

    return 0;
}

void printVecI(std::vector<int> vec) {
    for (int i=0; i<vec.size(); i++){
        std::cout << vec.at(i) << std::endl;
    }
}