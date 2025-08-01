public class CollegeFriendInfo {
    static class College {
        String collegeName;
        String place;

        College(String collegeName, String place) {
            this.collegeName = collegeName;
            this.place = place;
        }

        void displayCollege() {
            System.out.println("College Name: " + collegeName);
            System.out.println("Place: " + place);
        }
    }

    static class Friend extends College {
        String friendName;

        Friend(String collegeName, String place, String friendName) {
            super(collegeName, place);
            this.friendName = friendName;
        }

        void displayFriend() {
            super.displayCollege();
            System.out.println("Friend Name: " + friendName);
        }
    }

    public static void main(String[] args) {
        Friend f1 = new Friend("HKBK College of Engineering", "Bangalore", "Rahul");
        f1.displayFriend();
    }
}
