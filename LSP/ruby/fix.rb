# They must have the same interface.
# Since Ruby does not have abstract methods, we can do it like so:

class Animal
  def walk
    # do some walking
  end

  def run
    raise NotImplementedError
  end
end

class NotImplementedError < Error
  def initialize(msg="Method not implemented")
    super
  end
end

class Cat < Animal
  def run
    # run like a cat
  end
end
