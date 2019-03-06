package com.company;

    public class AQueue {

        private int head;
        private int tail;
        private int count;

        private static final int QUEUE_SIZE = 32;
        String[] queue;

        public AQueue(){
            queue = new String[QUEUE_SIZE];
        }

        public AQueue(int size){
            queue = new String[size];
        }

        public int maxSize(){
            return queue.length;
        }

        // Handles removal of head node in queue by "shifting" queue down 1
        // and lowering count of whole queue by 1
        public String remove(){
            if (isEmpty()){
                return null;
            }
            else {
                String rtn = queue[head++];

                // Handle wrap around case
                if (head == queue.length){
                    head = 0;
                }
                count--;
                return rtn;
            }
        }

        public boolean add(String data){
            if (isFull()){
                return false;
            }
            else {
                queue[tail++] = data;
                count++;
                if (tail == queue.length){
                    tail = 0; // cures the wrapping around if tail happens to equal 32
                }
                return true;
            }
        }

        public int size(){
            // number of items in the queue
            return count;
        }

        public boolean isEmpty(){
            return (count == 0);
        }

        public boolean isFull(){
            return (count == queue.length);
        }

        /**
         * @return String: return head of queue
         */
        public String peek(){
            if (isEmpty()) {
                return null;
            }
            else {
                return queue[head];
            }
        }

        /**
         * @param elements
         */
        public void ensureCapacity(int elements){
            if (maxSize() >= elements){
                return;
            }
            else {
                String[] newQ = new String[elements];

                if (count > 0) {
                    int tmp = head;
                    for (int i = 0; i < count; i++) {

                        newQ[i] = queue[tmp++];
                        if (tmp == queue.length) {
                            tmp = 0;
                        }
                    }
                    head = 0;
                    tail = count; // Set to 0
                }
                else {
                    // Put nothing in old queue
                    count = head = tail = 0;
                }
                queue = newQ;
            }
        }

        public String toString(){
            String rtn = "";

            int tmp = head;
            rtn += "Head -> ";

            for (int i = 0; i < count; i++){
                rtn += queue[tmp++] + "\n";
                if (tmp == queue.length) {
                    tmp = 0;
                }
            }
            return rtn;
        }

}


