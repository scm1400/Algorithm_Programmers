class Solution {
	public String solution(String new_id) {
		String id = "";

		// 1�ܰ� new_id�� ��� �빮�ڸ� �����Ǵ� �ҹ��ڷ� ġȯ�մϴ�.
		new_id = new_id.toLowerCase();

		// 2�ܰ� new_id���� ���ĺ� �ҹ���, ����, ����(-), ����(_), ��ħǥ(.)�� ������ ��� ���ڸ� �����մϴ�.
		for (int i = 0; i < new_id.length(); i++) {
			char ch = new_id.charAt(i);

			if (ch >= 'a' && ch <= 'z') {
				id += String.valueOf(ch);
			} else if (ch >= '0' && ch <= '9') {
				id += String.valueOf(ch);
			} else if (ch == '.' || ch == '-' || ch == '_') {
				id += String.valueOf(ch);
			}
		}

		// 3�ܰ� new_id���� ��ħǥ(.)�� 2�� �̻� ���ӵ� �κ��� �ϳ��� ��ħǥ(.)�� ġȯ�մϴ�.
		while (true) {
			if (id.contains("..")) {
				id = id.replace("..", ".");
			} else {
				break;
			}
		}

		// 4�ܰ� new_id���� ��ħǥ(.)�� ó���̳� ���� ��ġ�Ѵٸ� �����մϴ�.
		if (id.startsWith(".")) {
			id = id.substring(1);
		} else if (id.endsWith(".")) {
			id = id.substring(0, id.length() - 1);
		}

		// 5�ܰ� new_id�� �� ���ڿ��̶��, new_id�� "a"�� �����մϴ�.
		if (id.length() == 0) {
			id += "a";
		}

		// 6�ܰ� new_id�� ���̰� 16�� �̻��̸�, new_id�� ù 15���� ���ڸ� ������ ������ ���ڵ��� ��� �����մϴ�.
		if (id.length() >= 16) {
			id = id.substring(0, 15);
		}

		// ���� ���� �� ��ħǥ(.)�� new_id�� ���� ��ġ�Ѵٸ� ���� ��ġ�� ��ħǥ(.) ���ڸ� �����մϴ�.
		if (id.endsWith(".")) {
			id = id.substring(0, id.length() - 1);
		}

		// 7�ܰ� new_id�� ���̰� 2�� ���϶��, new_id�� ������ ���ڸ� new_id�� ���̰� 3�� �� ������ �ݺ��ؼ� ���� ���Դϴ�.
		if (id.length() <= 2) {
			char lastchar = id.charAt(id.length() - 1);
			for (int j = 0; j < (4 - id.length()); j++) {
				id += lastchar;
			}
		}
		return id;
	}
}