package com.zensar.spring.performers;

import com.zensar.spring.poems.Poem;

public class PoeticJugler extends Jugler {
		private Poem poem;

		public PoeticJugler(int beanBags, Poem poem) {
			super(beanBags);
			this.poem = poem;
			System.out.println("Param of poetic jugler");
		}
		public PoeticJugler() {
			// TODO Auto-generated constructor stub
			System.out.println("NON-Param of poetic jugler");
		}
		@Override
		public void perform() {
			// TODO Auto-generated method stub
			super.perform();
			System.out.println("While reciting a poem");
			poem.recite();
		}
	
}
