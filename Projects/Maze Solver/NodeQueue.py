from collections import deque


class NodeQueue:

    def __init__(self):
        # deque performs better from left side of list compared to pop(0) on normal list
        self.items = deque([])

    def enqueue(self, item):
        self.items.append(item)

    def dequeue(self):

        # if the stack is not empty
        if self.items:
            return self.items.popleft()

        else:
            return None

    def queue_size(self):
        return len(self.items)

