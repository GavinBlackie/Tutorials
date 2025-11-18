#include <iostream>
#include <vector>

int main() {

    // Vectors: like arrays, but their sizes can change

    std::vector<int> lotteryNumVect(10);

    int lotteryNumArray[5] = {4, 3, 1, 2, 9};

    lotteryNumVect.insert(lotteryNumVect.begin(), lotteryNumArray,lotteryNumArray + 3);

    lotteryNumVect.insert(lotteryNumVect.begin() + 5, 44);

    // Push the data back 64 spaces
    lotteryNumVect.push_back(64);

    std::cout << lotteryNumVect.back() << std::endl;

    return 0;
}